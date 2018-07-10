package czy.demo.thread;

import java.util.Date;

public class SleepTest {

    public static void main(String[] args)throws Exception{
        Thread t = new Thread(()->{
            while(true){
                System.out.println("当前时间为："+new Date().toString());
                try{
                    /* 可以使当前线程沉睡3秒，每次沉睡之后会从沉睡处继续运行 */
                    System.out.println("线程开始沉睡");
                    Thread.sleep(3000);
                    System.out.println("线程已经睡醒");
                }catch(Exception ex){

                }
            }
        });
        t.start();
    }

}
