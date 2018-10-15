package czy.demo.swing.color;

import czy.demo.swing.graphics.DrawTest;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class ColorTest {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ColorFrame();
                frame.setTitle("填充示例");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    static class ColorFrame extends JFrame{
        public ColorFrame(){
            add(new ColorComponent());
            pack();
        }
    }

    static class ColorComponent extends JComponent{
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
            double centerX = rect.getCenterX();
            double centerY = rect.getCenterY();
            double radius = 150;

            /* 绘制圆形,设置圆心与外接矩形的一个顶点 */
            Ellipse2D circle = new Ellipse2D.Double();
            circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);

            /* setPaint方法设置了当前画笔的颜色 */
            g2.setPaint(Color.BLUE);
            /* draw方法只是使用画笔绘画图形边框,fill方法可以填充图形颜色 */
            g2.fill(circle);

            /* 后面的图形颜色可以覆盖前面绘制的图形 */
            g2.setPaint(Color.RED);
            g2.fill(rect);

            /* 绘制椭圆,设置外接长方形 */
            Ellipse2D ellipse = new Ellipse2D.Double();
            ellipse.setFrame(rect);
            g2.setPaint(Color.GREEN);
            g2.fill(ellipse);

            g2.setPaint(Color.BLACK);
            /* 绘制直线 */
            g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));



        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(default_width,default_height);
        }
    }

}
