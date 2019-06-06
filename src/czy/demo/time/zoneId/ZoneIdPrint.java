package czy.demo.time.zoneId;


import java.time.ZoneId;

public class ZoneIdPrint {

    public static void print(ZoneId zoneId){
        say("时区ID为："+zoneId.getId());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
