package czy.demo.util.concurrent.timeunit;

import java.util.concurrent.TimeUnit;

public class TimeUnitPrint {

    public static void print(TimeUnit unit,long value){
        say("转换为纳秒："+unit.toNanos(value));
        say("转换为微秒："+unit.toMicros(value));
        say("转换为毫秒："+unit.toMillis(value));
        say("转换为秒："+unit.toSeconds(value));
        say("转换为分钟："+unit.toMinutes(value));
        say("转换为小时："+unit.toHours(value));
        say("转换为天："+unit.toDays(value));
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
