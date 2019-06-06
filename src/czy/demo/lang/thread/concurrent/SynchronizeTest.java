package czy.demo.lang.thread.concurrent;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 并发测试，分别测试了：不加锁、方法加锁、方法块类加锁、方法块对象加锁几种情况
 */
public class SynchronizeTest {

    private static Integer num = 0 ;

    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args){
        System.out.println("开始时间为："+new Date().toString());
        for(int i=0;i<1000000;i++){
            new Thread(()->{
                general();
                //methodSync();
                //classSync();
                //objSync();
                //lockSync();
            }).start();
        }

    }

    /* 输出的值有大量的重复值，说明方法的调用以及对变量的修改是并发进行的 */
    public static void general(){
        System.out.println("当前时间为："+new Date().toString());
        System.out.println("当前数值为："+num);
        num +=1;
    }

    /* 按顺序输出值，说明是同步调用的 */
    public static synchronized void methodSync(){
        System.out.println("当前时间为："+new Date().toString());
        System.out.println("当前数值为："+num);
        num+=1;
    }

    /* 由于是静态变量，对类加锁时也是同步调用的 */
    public static void classSync(){
        synchronized(SynchronizeTest.class){
            System.out.println("当前时间为："+new Date().toString());
            System.out.println("当前数值为："+num);
            num+=1;
        }
    }

    /* 简单类型不能加锁，只有Integer可以加锁，对字段加锁也是同步调用的 */
    public static void objSync(){
        synchronized(SynchronizeTest.num){
            System.out.println("当前时间为："+new Date().toString());
            System.out.println("当前数值为："+num);
            num+=1;
        }
    }

    /**
     * 锁同步，需要同步的代码在lock、unlock方法之间
     * 如果加锁之后不释放，则其他线程无法访问需要获取锁才能运行的代码块
     */
    public static void lockSync(){
        lock.lock();
        System.out.println("当前时间为："+new Date().toString());
        System.out.println("当前数值为："+num);
        num+=1;
        lock.unlock();
    }


}
