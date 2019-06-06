package czy.demo.lang.thread.status;

import java.util.concurrent.atomic.AtomicInteger;

public class WaitTest {

    public static AtomicInteger num = new AtomicInteger(0) ;

    /**
     * 这里终于成功，最大的问题是wait/notify这两个方法都必须在获取锁之后进行调用
     * 如果无锁调用，会抛出异常
     * wait操作相当于把同步调用分割开来，其实会破坏同步的本来意义
     * 因为在wait时间内，其他获取锁的线程，会对对象进行操作
     * 这里会有一个问题：
     * 首先，简单对象不能加锁，所以需要使用包装类型
     * 但是，在执行Integer = 1 + 1这种操作时，都会创建一个新的包装器对象，而不是使用原有的包装器
     * 这样锁对象就被替换了，而我们持有的是操作之前的对象的锁，所以调用wait就会发生异常
     * 这里需要使用java.util.concurrent.atomic.Atomic开头的包装器对象，这些对象直接操作内存，不会改变对象引用
     */
    public static void main(String[] args)throws Exception{
        new Thread(()->{
            try{
                synchronized (num){
                    System.out.println("线程即将进入等待："+num.getAndAdd(1));
                    num.wait();
                    System.out.println("线程等待结束:"+num.getAndAdd(1));
                }
            }catch(Exception ex){
                System.out.println("线程内发生异常"+ex);
            }
        }).start();
        Thread.sleep(3000);
        synchronized (num){
            System.out.println("准备通知锁上的等待对象："+num.getAndAdd(1));
            num.notifyAll();
            System.out.println("通知结束："+num.getAndAdd(1));
        }
    }
}
