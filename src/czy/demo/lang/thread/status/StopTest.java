package czy.demo.lang.thread.status;

import java.util.Date;

/* stop方法可以结束子线程运行，而exit方法为private方法 */
public class StopTest {

    public static void main(String[] args)throws Exception{
        Thread thread = new Thread(()->{
            try{
                while(true){
                    System.out.println("线程还在运行："+new Date().toString());
                    Thread.sleep(1000);
                }
            }catch(Exception ex){}
        });
        thread.start();
        Thread.sleep(10000);
        System.out.println("即将结束子线程运行："+new Date().toString());
        thread.stop();
    }

}
