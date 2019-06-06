package czy.demo.time.clock;


import java.time.Clock;
import java.util.Date;

public class ClockPrint {

    public static void print(Clock clock){
        say("时区ID："+clock.getZone().getId());
        say("当前时间戳为："+clock.millis());
        say("当前时间为："+new Date(clock.millis()).toLocaleString());
        say("unix时间秒数为："+clock.instant().getEpochSecond());
        say("纳秒数为："+clock.instant().getNano());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
