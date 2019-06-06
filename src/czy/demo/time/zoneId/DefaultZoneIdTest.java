package czy.demo.time.zoneId;

import java.time.ZoneId;

public class DefaultZoneIdTest {

    public static void main(String[] args){
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneIdPrint.print(zoneId);
    }

}
