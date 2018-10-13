package czy.demo.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Simple {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame  = new ImageViewerFrame();
                frame.setTitle("ImageViewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }


    static class ImageViewerFrame extends JFrame{

        private JLabel label;

        private JFileChooser chooser;

        private static final int width = 300;

        private static final int height = 400;

        public ImageViewerFrame(){
            setSize(width,height);

            label = new JLabel();
            add(label);

            chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));

            JMenuBar menuBar = new JMenuBar();
            setJMenuBar(menuBar);

            JMenu menu = new JMenu();
            menuBar.add(menu);

            JMenuItem openItem = new JMenuItem("Open");
            menu.add(openItem);

            openItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = chooser.showOpenDialog(null);
                    if(result == JFileChooser.APPROVE_OPTION){
                        String name = chooser.getSelectedFile().getPath();
                        label.setIcon(new ImageIcon(name));
                    }
                }
            });

            JMenuItem exitItem = new JMenuItem("Exit");
            menu.add(exitItem);
            exitItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }

    }

}
