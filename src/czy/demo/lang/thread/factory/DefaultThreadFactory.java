package czy.demo.lang.thread.factory;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * ThreadFactory可以工厂化创建线程
 */
public class DefaultThreadFactory {

    private static final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("朋友你好！");
        }
    };

    public static void main(String[] args){
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(runnable).start();
    }

}
