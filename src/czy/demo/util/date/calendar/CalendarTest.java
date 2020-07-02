package czy.demo.util.date.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

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
        say("毫秒表示时间为："+cal.getTimeInMillis());
        say("得到的日历类型为："+cal.getCalendarType());
        say("一周的第一天为："+cal.getFirstDayOfWeek());
        say("年份为："+cal.getWeekYear());
        say("一年得周数为："+cal.getWeeksInWeekYear());
        say("上午时间为："+cal.get(Calendar.AM));
        say("下午时间为："+cal.get(Calendar.AM_PM));

        say("年份为："+cal.get(Calendar.YEAR));

        say("当年的第几月："+cal.get(Calendar.MONTH));//一年的第几月，从0开始

        say("当月的第几周："+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));//一月的第几周

        say("当年的第几天："+cal.get(Calendar.DAY_OF_YEAR));//一年的第几天
        say("当月的第几天："+cal.get(Calendar.DAY_OF_MONTH));//一月的第几天
        say("当周的第几天："+cal.get(Calendar.DAY_OF_WEEK));//一周的第几天
        say("日期为："+cal.get(Calendar.DATE));//也是当月的第几号

        say("小时数为："+cal.get(Calendar.HOUR));//12小时制
        say("一天的小时数为："+cal.get(Calendar.HOUR_OF_DAY));//24小时制
        say("分钟数为："+cal.get(Calendar.MINUTE));
        say("秒数为："+cal.get(Calendar.SECOND));
        say("毫秒数为："+cal.get(Calendar.MILLISECOND));


        Calendar calendar = new GregorianCalendar(2018,1 ,0 );
        say("时间为："+calendar.getTime().toString());

    }

    public static void say(String s){
        System.out.println(s);
    }

}
