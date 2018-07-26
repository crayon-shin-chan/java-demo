package czy.demo.thread;

import java.util.Date;

public class DaemonTest {

    /* 经测试，子线程设置为守护线程时，父线程退出，子线程立即退出 */
    public static void main(String[] args)throws Exception{
        Thread thread = new Thread(()->{
            while(true){
                try{
                    Thread.sleep(1000);
                    System.out.println("子线程依然在运行："+new Date().toString());
                }catch(Exception ex){ }
            }
        });
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(10000);
        System.out.println("父线程即将退出："+new Date().toString());
    }
}
