package czy.demo.util.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer类为定时任务
 * 可以延迟、周期性的执行任务
 */
public class SimpleTest {

    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("调度任务执行");
            }
        },5000);
    }

}
