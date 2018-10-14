package czy.demo.swing.component;

import javax.swing.*;
import java.awt.*;

/* awt组件测 */
public class ComponentTest {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension dimension = toolkit.getScreenSize();
                JFrame frame = new HelloWorldFrame();
                frame.setLocation(dimension.width/2,dimension.height/2);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    /* 组件类,集成了JComponent */
    static class HelloWorldComponent extends JComponent{

        private static final int width = 75;
        private static final int height = 100;

        private static final int default_width = 300;
        private static final int default_height = 200;

        /* 系统调用的组件绘制方法 */
        @Override
        protected void paintComponent(Graphics g) {
            g.drawString("Hello World !",width,height);
        }

        /* 组件的首选方法,JFrame的pack方法调用会选用 */
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(default_width,default_height);
        }


    }

    static class HelloWorldFrame extends JFrame{

        public HelloWorldFrame(){

            /* JFrame的add方法实际上是调用了内容窗格的add方法 */
            Container container = this.getContentPane();
            JComponent component = new HelloWorldComponent();
            container.add(component);
            pack();

        }

    }

}
