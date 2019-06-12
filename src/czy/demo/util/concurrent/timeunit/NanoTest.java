package czy.demo.util.concurrent.timeunit;

import java.util.concurrent.TimeUnit;

/* 纳秒示例 */
public class NanoTest {

    public static void main(String[] args){
        long value = 212133123656345L;
        TimeUnit unit = TimeUnit.NANOSECONDS;
        TimeUnitPrint.print(unit,value);
    }

}
