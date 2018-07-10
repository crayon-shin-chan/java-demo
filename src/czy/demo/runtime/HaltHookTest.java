package czy.demo.runtime;

import java.util.Random;

public class HaltHookTest {

    public static void main(String[] args){

        /* 在执行halt时，不会执行退出钩子 */
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("这是halt退出钩子");
        }));

        int length = 10000;
        int k = new Random().nextInt(length);
        for(int i=0;i<length;i++){
            say(i);
            if(i==k){
                System.out.println("准备退出，退出之前执行退出钩子");

                /* 以指定的状态码退出进程 */
                Runtime.getRuntime().halt(5);
            }
        }
    }

    public static void say(int i){
        System.out.println("当前数字为："+i);
    }
}
