package czy.demo.swing.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/* 绘图示例 */
public class DrawTest {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new DrawFrame();
                frame.setTitle("绘图示例");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    static class DrawFrame extends JFrame{
        public DrawFrame(){
            add(new DrawComponent());
            pack();
        }
    }

    static class DrawComponent extends JComponent{
        private static final int default_width = 400;
        private static final int default_height = 400;

        @Override
        protected void paintComponent(Graphics g) {

            Graphics2D g2 = (Graphics2D)g;

            double leftX = 100;
            double topY = 100;
            double width = 200;
            double height = 150;

            /* 绘制长方形,设置左上角,长宽 */
            Rectangle2D rect = new Rectangle2D.Double(leftX,topY,width,height);
            g2.draw(rect);

            /* 绘制椭圆,设置外接长方形 */
            Ellipse2D ellipse = new Ellipse2D.Double();
            ellipse.setFrame(rect);
            g2.draw(ellipse);

            /* 绘制直线 */
            g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));

            double centerX = rect.getCenterX();
            double centerY = rect.getCenterY();
            double radius = 150;

            /* 绘制圆形,设置圆心与外接矩形的一个顶点 */
            Ellipse2D circle = new Ellipse2D.Double();
            circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
            g2.draw(circle);

        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(default_width,default_height);
        }
    }

}
