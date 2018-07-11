package czy.demo.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args){
        Date date = new Date();

        DateFormat format1 = DateFormat.getDateInstance(DateFormat.DEFAULT);
        DateFormat format2 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat format3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat format4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat format5 = DateFormat.getDateInstance(DateFormat.SHORT);
        /* 2018-7-11 */
        say("默认格式日期为："+format1.format(date));
        /* 2018年7月11日 星期三 */
        say("全格式日期为："+format2.format(date));
        /* 2018年7月11日 */
        say("长格式日期为："+format3.format(date));
        /* 2018-7-11 */
        say("中等格式日期为："+format4.format(date));
        /* 18-7-11 */
        say("短格式日期为："+format5.format(date));
        say("");

        DateFormat format6 = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        DateFormat format7 = DateFormat.getTimeInstance(DateFormat.FULL);
        DateFormat format8 = DateFormat.getTimeInstance(DateFormat.LONG);
        DateFormat format9 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        DateFormat format10 = DateFormat.getTimeInstance(DateFormat.SHORT);
        /* 15:12:14 */
        say("默认格式时间为："+format6.format(date));
        /* 下午03时12分14秒 CST */
        say("全格式时间为："+format7.format(date));
        /* 下午03时12分14秒 */
        say("长格式时间为："+format8.format(date));
        /* 15:12:14 */
        say("中等格式时间为："+format9.format(date));
        /* 下午3:12 */
        say("短格式时间为："+format10.format(date));
        say("");

        /* 日期时间格式化器，使用日期格式化模式与时间格式化模式生成 */
        DateFormat format11 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT);
        DateFormat format12 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        DateFormat format13 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        DateFormat format14 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        DateFormat format15 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        /* 2018-7-11 15:14:51 */
        say("默认格式日期时间为："+format11.format(date));
        /* 2018年7月11日 星期三 下午03时14分51秒 CST */
        say("全格式日期时间为："+format12.format(date));
        /* 2018年7月11日 下午03时14分51秒 */
        say("长格式日期时间为："+format13.format(date));
        /* 2018-7-11 15:14:51 */
        say("中等格式日期时间为："+format14.format(date));
        /* 18-7-11 下午3:14 */
        say("短格式日期时间为："+format15.format(date));
        say("");
    }

    public static void say(String s){
        System.out.println(s);
    }
}
