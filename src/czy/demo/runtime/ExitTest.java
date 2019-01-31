package czy.demo.runtime;

import java.util.Random;

public class ExitTest {

    public static void main(String[] args){
        int length = 10000;
        int k = new Random().nextInt(length);
        for(int i=0;i<length;i++){
            say(i);
            if(i==k){
                System.out.println("准备退出");
                /* 以指定的状态码退出进程 */
                Runtime.getRuntime().exit(5);
            }
        }
    }

    public static void say(int i){
        System.out.println("当前数字为："+i);
    }
}
