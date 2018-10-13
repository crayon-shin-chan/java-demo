package czy.demo.applet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class WelcomeApplet extends JApplet {

    public void init(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                setLayout(new BorderLayout());

                JLabel label = new JLabel("welcome",SwingConstants.CENTER);
                label.setFont(new Font("Serif",Font.BOLD,18));
                add(label,BorderLayout.CENTER);

                JPanel panel = new JPanel();

                JButton cayButton = new JButton("百度");
                cayButton.addActionListener(makeAction("http://www.baidu.com"));
                panel.add(cayButton);

                JButton grayButton = new JButton("Gray Cornell");
                grayButton.addActionListener(makeAction("mailto:gray_cornell@apress.com"));
                panel.add(grayButton);

                add(panel,BorderLayout.SOUTH);
            }
        });
    }

    private ActionListener makeAction(final String urlString){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    getAppletContext().showDocument(new URL(urlString));
                }catch(MalformedURLException ex){
                    ex.printStackTrace();
                }
            }
        };
    }

}
