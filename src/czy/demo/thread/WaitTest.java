package czy.demo.thread;

import java.util.Date;
import java.util.Random;

public class WaitTest {

    public static Integer num = 0 ;
    public static Random ran = new Random();

    /* 这个例子写的不对，后面还要重写 */
    public static void main(String[] args)throws Exception{
        new Thread(new Runnable() {
            @Override
            public void run(){
                while(true){
                    try{
                        synchronized (num){
                            System.out.println("线程一获取锁");
                            System.out.println("当前值为："+num);
                            Thread.currentThread().sleep(3000);
                            if(num>=0){
                                /* wait方法只是一个短暂的等待，即给其他线程一个获取锁的机会 */
                                num.notifyAll();
                                num.wait();
                            }else {
                                num += ran.nextInt(5);
                            }
                        }
                    }catch(Exception ex){}

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run(){
                while(true){
                    try{
                        synchronized (num){
                            System.out.println("线程二获取锁");
                            System.out.println("当前值为："+num);
                            Thread.currentThread().sleep(3000);
                            if(num>=0){
                                num-=ran.nextInt(5);
                            }else{
                                num.notifyAll();
                                num.wait();
                            }

                        }
                    }catch(Exception ex){}

                }
            }
        }).start();
    }
}
