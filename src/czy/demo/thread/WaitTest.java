package czy.demo.thread;

import java.util.Date;

public class WaitTest {

    public static void main(String[] args){
        Thread t = new Thread(()->{
            while(true){
                System.out.println("当前时间为："+new Date().toString());
                try{
                    System.out.println("线程进入等待");
                    Thread.currentThread().wait();
                    System.out.println("线程等待完毕");
                }catch(Exception ex){

                }
            }
        });
    }
}
