package czy.demo.time.clock;

import java.time.Clock;

/* 系统UTC时钟 */
public class SystemUTCTest {

    public static void main(String[] args){
        Clock clock = Clock.systemUTC();
        ClockPrint.print(clock);
    }

}
