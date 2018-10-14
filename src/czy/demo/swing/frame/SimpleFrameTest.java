package czy.demo.swing.frame;

import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {

    public static void main(String[] args){

        /* swing程序需要在事件队列中启动新线程,只有这样才能将鼠标点击和按键控制转移到用户接口组件 */
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                JFrame frame = new SimpleFrame();
                //frame.setSize(300,200);

                /* 设置窗口标题 */
                frame.setTitle("Swing测试窗口");

                /* 设置框架在屏幕上水平,垂直坐标,默认为0,0 */
                frame.setLocation(600,300);

                /* 一次设置位置与大小 */
                //frame.setBounds(0,0,600,300);

                /* 窗口大小是否允许改变,默认可以改变 */
                frame.setResizable(false);

                /* 用户关闭框架时的响应动作,默认情况为关闭时隐藏 */
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                /* 设置可见性,默认为不可见 */
                frame.setVisible(true);
            }
        });
    }

    /* JFrame的实现类,一般都会实现一个JFrame的子类,将复杂逻辑,常量等放在子类中,其实也可以直接创建JFrame */
    static class SimpleFrame extends JFrame{

        public SimpleFrame(){

            /* 获取工具包 */
            Toolkit kit = Toolkit.getDefaultToolkit();

            /* 获取当前屏幕分辨率 */
            Dimension dimension = kit.getScreenSize();
            int width = dimension.width;
            int height = dimension.height;
            /* 设置宽高 */
            setSize(width/2,height/2);
        }
    }

}
