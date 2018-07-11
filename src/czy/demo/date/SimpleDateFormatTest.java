package czy.demo.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {


    public static void main(String[] args){
        Date date = new Date();
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        DateFormat format3 = new SimpleDateFormat("yyyy-MM-dd hh");
        DateFormat format4 = new SimpleDateFormat("yyyy-MM-dd");

        /* 2018-07-11 03:23:29 */
        say("格式一时间为："+format1.format(date));
        /* 2018-07-11 03:23 */
        say("格式二时间为："+format2.format(date));
        /* 2018-07-11 03 */
        say("格式三时间为："+format3.format(date));
        /* 2018-07-11 */
        say("格式四时间为："+format4.format(date));
    }

    public static void say(String s){
        System.out.println(s);
    }
}
