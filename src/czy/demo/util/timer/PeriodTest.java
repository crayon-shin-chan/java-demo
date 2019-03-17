package czy.demo.util.timer;

import java.util.Timer;
import java.util.TimerTask;

/* 周期性的执行任务 */
public class PeriodTest {

    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("执行任务");
            }
        },5000,1000);
    }

}
