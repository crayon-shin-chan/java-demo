package czy.demo.thread;

import java.util.Date;

/**
 * 并发测试，分别测试了：不加锁、方法加锁、方法块类加锁、方法块对象加锁几种情况
 */
public class SynchronizeTest {

    static Integer num = 0 ;

    public static void main(String[] args){
        System.out.println("开始时间为："+new Date().toString());
        for(int i=0;i<10000;i++){
            new Thread(()->{
                //increment();
                //methodSync();
                //blockSync();
                fieldSync();
            }).start();
        }

    }

    /* 输出的值有大量的重复值，说明方法的调用以及对变量的修改是并发进行的 */
    public static void increment(){
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
    public static void blockSync(){
        synchronized(SynchronizeTest.class){
            System.out.println("当前时间为："+new Date().toString());
            System.out.println("当前数值为："+num);
            num+=1;
        }
    }

    /* 简单类型不能加锁，只有Integer可以加锁，对字段加锁也是同步调用的 */
    public static void fieldSync(){
        synchronized(SynchronizeTest.num){
            System.out.println("当前时间为："+new Date().toString());
            System.out.println("当前数值为："+num);
            num+=1;
        }
    }


}
