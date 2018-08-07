package czy.demo.util.date;

import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public class CalendarTest {

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance(TimeZone.getDefault());
        Calendar cal2 = Calendar.getInstance(Locale.getDefault());
        Set<String> types = Calendar.getAvailableCalendarTypes();
        Locale[] locales = Calendar.getAvailableLocales();

        /* 可用的日历类型：格雷格里历、佛教历、日本历 */
        say("可用的日历类型为：");
        for(String s:types){
            say("   "+s);
        }
        say("");

        /*
        say("可用的Locale类型为：");
        for(Locale locale:locales){
            say("   "+locale);
        }
        say("");
        */
        say("得到的时间为："+cal.getTime());
        say("得到的时区为："+cal.getTimeZone());
        say("得到的时间戳为："+cal.getTimeInMillis());
        say("得到的日历类型为："+cal.getCalendarType());
        say("一周的第一天为："+cal.getFirstDayOfWeek());
        say("年份为："+cal.getWeekYear());
        say("一年得周数为："+cal.getWeeksInWeekYear());
    }

    public static void say(String s){
        System.out.println(s);
    }

}
