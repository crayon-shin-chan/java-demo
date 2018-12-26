package czy.demo.util.date;

import java.util.*;

public class CalendarTest {

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        Set<String> types = Calendar.getAvailableCalendarTypes();

        /* 可用的日历类型：格雷格里历、佛教历、日本历 */
        say("可用的日历类型为：");
        for(String s:types){
            say("   "+s);
        }
        say("");
        say("得到的时间为："+cal.getTime());
        say("得到的时区为："+cal.getTimeZone());
        say("得到的时间戳为："+cal.getTimeInMillis());
        say("得到的日历类型为："+cal.getCalendarType());
        say("一周的第一天为："+cal.getFirstDayOfWeek());
        say("年份为："+cal.getWeekYear());
        say("一年得周数为："+cal.getWeeksInWeekYear());

        Calendar calendar = new GregorianCalendar(2018,1 ,1 );
        say("时间为："+calendar.getTime().toString());

    }

    public static void say(String s){
        System.out.println(s);
    }

}
