package czy.demo.lang.thread.status;

import java.util.Date;

public class InterruptTest {

    public static void main(String[] args)throws Exception{
        //generalInterupt();
        sleepInterrupt();
    }

    /**
     * 首先，中断是一个请求，而不是一个命令，子线程只会接收到这个请求，而不会被强制运行任何命令
     * 所以说，线程并没有中断这个状态，只有新建、运行、阻塞、死亡这几个状态
     * 子线程会接收到一个中断标识为true的效果，可以通过Thread.interrupted()方法进行判断当前线程中断标识
     * 但是这里有一个问题，判断之后中断标识是什么：
     * 1.如果调用Thread.interrupted()进行当前线程的中断标识判断，则判断之后会被重置为false
     * 2.如果调用实例方法isInterrupted()进行判断，则中断标识不会被重置
     */
    public static void generalInterupt()throws Exception{
        Thread thread = new Thread(()->{
            while(!Thread.interrupted()){
                for(int i=0;i<1000000;i++){}
                System.out.println("线程还在运行："+new Date());
            }
            System.out.println("线程接收到中断请求，当前中断标记为："+Thread.interrupted());
            System.out.println("准备退出线程");
        });
        thread.start();
        Thread.sleep(10000);
        System.out.println("准备中断子线程："+new Date());
        thread.interrupt();
    }

    /**
     * 线程在阻塞状态(sleep,wait)，此时接收到中断请求，会抛出中断异常并且清除中断标记
     */
    public static void sleepInterrupt()throws Exception{
        Thread thread = new Thread(()->{
            try{
                while(true){
                    System.out.println("线程准备沉睡，进入阻塞状态："+new Date());
                    Thread.sleep(1000);
                }
            }catch(InterruptedException ex){
                /* 由于中断标记被清除，所以这里为true */
                System.out.println("线程的中断标识为："+Thread.interrupted());
                System.out.println("线程发生中断异常，准备退出："+ex);
            }
        });
        thread.start();
        Thread.sleep(10000);
        System.out.println("准备中断子线程："+new Date());
        thread.interrupt();
    }

}
