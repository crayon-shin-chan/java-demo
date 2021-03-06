package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 正则表达式数字测试 */
public class DigitalTest {

    public static void main(String[] args){

        String content = "123,45,67,89";

        String regex = "^(\\d+),(\\d+),(\\d+),(\\d+)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配："+m.matches());
        System.out.println("捕获组数量："+m.groupCount());
        for(int i=1;i<=m.groupCount();i++){
            System.out.println("第"+i+"个捕获组为："+m.group(i)+"，长度为："+m.group(i).length());
        }

    }

}

