package czy.demo.thread.status;

import java.util.Date;
import java.util.Random;

public class SleepTest {

    public static void main(String[] args)throws Exception{
        Random random = new Random(100);
        while(true){
            Date start = new Date();
            System.out.println("线程开始沉睡："+start.toString());
            int duration = random.nextInt(5000);
            Thread.sleep(duration);
            Date end = new Date();
            System.out.println("线程沉睡结束："+end.toString());
            System.out.println("应该沉睡时间："+duration);
            System.out.println("实际沉睡时间："+(end.getTime()-start.getTime()));

        }
    }

}
