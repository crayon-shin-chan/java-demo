package czy.demo.util.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* 以Date对象为参数执行任务 */
public class DateTest {

    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务执行");
            }
        },new Date(System.currentTimeMillis()+5000));
    }

}
