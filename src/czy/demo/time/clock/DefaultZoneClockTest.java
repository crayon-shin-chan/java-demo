package czy.demo.time.clock;

import java.time.Clock;

/* 系统默认时区时钟，时钟实际上还是使用了系统时间 */
public class DefaultZoneClockTest {

    public static void main(String[] args){

        Clock clock = Clock.systemDefaultZone();
        ClockPrint.print(clock);
    }

}
