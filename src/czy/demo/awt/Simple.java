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

            /* 菜单栏,属于JFrame,一对一 */
            JMenuBar menuBar = new JMenuBar();
            setJMenuBar(menuBar);

            /* 菜单,属于菜单栏,多对一 */
            JMenu menu = new JMenu("File");
            menuBar.add(menu);

            /* 菜单项,属于菜单,多对一,为下拉项 */
            JMenuItem openItem = new JMenuItem("Open");
            menu.add(openItem);

            /* 菜单项事件监听器 */
            openItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    /* 打开文件选择器,并且阻塞等待选择文件 */
                    int result = chooser.showOpenDialog(null);
                    /* 如果执行了选择 */
                    if(result == JFileChooser.APPROVE_OPTION){
                        /* 获取选择文件路径 */
                        String name = chooser.getSelectedFile().getPath();
                        /* 设置为标签图标 */
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
