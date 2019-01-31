package czy.demo.util.timer;

import java.util.Timer;
import java.util.TimerTask;

/* 定时器可以取消 */
public class CancelTest {

    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("执行任务");
            }
        },5000,1000);

        Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.cancel();
            }
        },10000);
    }


}
