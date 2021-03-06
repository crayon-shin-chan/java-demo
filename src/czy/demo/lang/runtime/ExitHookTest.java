package czy.demo.lang.runtime;

import java.util.Random;

public class ExitHookTest {

    public static void main(String[] args){

        /* 在执行exit时，会先执行退出进程的钩子 */
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("这是exit退出钩子");
        }));
        /* 以指定的状态码退出进程 */
        Runtime.getRuntime().exit(5);
    }
}
