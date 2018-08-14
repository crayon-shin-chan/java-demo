package czy.demo.util.regex;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimestampTest {

    public static void main(String[] args){
        Date now = new Date();
        String timestamp = now.toLocaleString();
        System.out.println("当前时间为："+timestamp);
        String regex = "^(\\d{4})-(\\d{1,2})-(\\d{1,2})\\s+(\\d{1,2}):(\\d{1,2}):(\\d{1,2})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(timestamp);
        System.out.println("是否匹配："+m.matches());
        System.out.println("捕获组数量："+m.groupCount());
        for(int i=1;i<=m.groupCount();i++){
            System.out.println(m.group(i));
        }
        int year = Integer.parseInt(m.group(1));
        int month = Integer.parseInt(m.group(2));
        int day = Integer.parseInt(m.group(3));
        int hour = Integer.parseInt(m.group(4));
        int minute = Integer.parseInt(m.group(5));
        int second = Integer.parseInt(m.group(6));
        Date c = new Date(year,month,day,hour,minute,second);
    }

}
