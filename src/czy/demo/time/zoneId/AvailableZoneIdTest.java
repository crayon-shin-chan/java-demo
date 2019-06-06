package czy.demo.time.zoneId;

import java.time.ZoneId;

/* 获取所有可用的时区ID */
public class AvailableZoneIdTest {

    public static void main(String[] args){
        System.out.println(ZoneId.getAvailableZoneIds());
    }

}
