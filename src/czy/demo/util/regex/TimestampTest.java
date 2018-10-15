package czy.demo.util.regex;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 时间戳匹配正则表达式测试 */
public class TimestampTest {

    public static void main(String[] args){

        Date now = new Date();

        /* 本地化字符串，表示为2018-10-15 10:22:00 */
        String timestamp = now.toLocaleString();
        System.out.println("当前时间为："+timestamp);

        /* 正则字符串，其中\\d为数字，\\s为空白字符，{}代表前面的数字或者空白的数量，()代表了一个捕获对象 */
        String regex = "^(\\d{4})-(\\d{1,2})-(\\d{1,2})\\s+(\\d{1,2}):(\\d{1,2}):(\\d{1,2})$";

        /* java中正则表达式需要编译 */
        Pattern p = Pattern.compile(regex);

        /* 使用编译后Pattern匹配时间，获取匹配对象 */
        Matcher m = p.matcher(timestamp);

        /* 匹配行为不仅会测试正则表达式代表的模式是否与字符串相匹配(即是否能代表字符串)，同时也会捕获正则表达式中的捕获对象 */

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
        System.out.println("生成时间为："+c.toLocaleString());
    }

}
