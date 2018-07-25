package czy.demo.thread;

import java.util.Date;

public class RelationTest {

    /* 经测试，父线程退出，子线程依然运行，说明子线程不依赖于父线程存在 */
    public static void main(String[] args)throws Exception{
        new Thread(()->{
            while(true){
                try{
                    Thread.sleep(1000);
                    System.out.println("子线程依然在运行："+new Date().toString());
                }catch(Exception ex){ }
            }
        }).start();
        Thread.sleep(10000);
        System.out.println("父线程即将退出："+new Date().toString());
    }
}
