package czy.demo.util.date.calendar;

import java.util.Calendar;

public class CalendarSetTest {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        say("原年份为："+c.get(Calendar.YEAR));
        c.set(Calendar.YEAR,1990);
        say("修改后年份为："+c.get(Calendar.YEAR));

        say("原月份为："+c.get(Calendar.MONTH));
        c.set(Calendar.MONTH,Calendar.JANUARY);
        say("修改后月份为："+c.get(Calendar.MONTH));

        int d = c.get(Calendar.DAY_OF_YEAR);
        say("原一年中的天数为："+d);
        c.set(Calendar.DAY_OF_YEAR,d+1);
        say("修改后一年中的天数为："+c.get(Calendar.DAY_OF_YEAR));
        say("修改后日期为："+c.get(Calendar.DATE));


        say("原日期为："+c.get(Calendar.DATE));
        c.set(Calendar.DATE,20);
        say("修改后日期为："+c.get(Calendar.DATE));


    }


    public static void say(String s){
        System.out.println(s);
    }
}
