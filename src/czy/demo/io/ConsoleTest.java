package czy.demo.io;

import java.io.Console;

public class ConsoleTest {

    public static void main(String[] args){
        /**
         * 由于IDE占用了Console对象，而Console对象是单例对象
         * 所以这里无法获取到Console对象
         */
        Console console = System.console();
        System.out.println(console.readLine("输入你的用户名："));
        System.out.println(console.readPassword("请输入你的密码："));
    }

}
