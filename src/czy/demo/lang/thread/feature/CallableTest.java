package czy.demo.lang.thread.feature;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* Callable接口代表了可以返回值的线程人物 */
public class CallableTest {

    public static void main(String[] args)throws Exception{

        /**
         * 一个Callable对象必须封装在FutureTask对象里
         * 这个FutureTask实现了Runnable接口，并且可以存储Callable的返回值
         * 使用FutureTask的get方法获取Callable返回值时，会阻塞，直到Callable方法返回
         */
        FutureTask<Long> task = new FutureTask<>(new Callable<Long>(){
            @Override
            public Long call(){
                System.out.println("计算任务开始运行："+new Date());
                try{
                    Thread.sleep(3000);
                }catch(Exception ex){}
                return new Date().getTime();
            }
        });
        new Thread(task).start();
        Long result = task.get();
        System.out.println("计算任务运行完毕："+new Date());
        System.out.println("当前时间戳为："+new Date().getTime());
        System.out.println("结果为："+result);
    }

}
