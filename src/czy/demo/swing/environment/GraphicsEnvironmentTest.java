package czy.demo.swing.environment;

import java.awt.*;
import java.util.Arrays;

public class GraphicsEnvironmentTest {

    public static void main(String[] args){

        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        /* 获取可以使用的字体家族名称 */
        String[] fonts = environment.getAvailableFontFamilyNames();
        System.out.println("当前可以使用的字体名为:"+ Arrays.toString(fonts));

        GraphicsDevice device = environment.getDefaultScreenDevice();
    }


}
