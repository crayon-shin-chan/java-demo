package czy.demo.util.date.calendar;

import java.util.Calendar;

public class CalendarAddTest {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        say("原年份为："+c.get(Calendar.YEAR));
        c.add(Calendar.YEAR,1);//年份加1
        say("修改后年份为："+c.get(Calendar.YEAR));
        c.add(Calendar.YEAR,-10);//年份减10
        say("修改后年份为："+c.get(Calendar.YEAR));

        say("原月份为："+c.get(Calendar.MONTH));
        c.add(Calendar.MONTH,2);//月份加2
        say("修改后月份为："+c.get(Calendar.MONTH));
        c.add(Calendar.MONTH,5);//月份加5，会进位，年份会加1
        say("修改后月份为："+c.get(Calendar.MONTH));
        say("修改后年份为："+c.get(Calendar.YEAR));


        say("原日期为："+c.get(Calendar.DATE));
        c.add(Calendar.DATE,3);//日期加3
        say("修改后日期为："+c.get(Calendar.DATE));
        c.add(Calendar.DATE,-10);//日期减10，会向月份借位，月份会减1
        say("修改后日期为："+c.get(Calendar.DATE));
        say("修改后月份为："+c.get(Calendar.MONTH));

    }

    public static void say(String s){
        System.out.println(s);
    }

}
