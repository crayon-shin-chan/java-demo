package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 捕获组引用示例 */
public class CaptureRefTest {

    public static void main(String[] args){

        String content = " 12 123 1234 12 ";

        /* 正则表达式可以使用\\1引用第一个捕获组,\\2引用第二个捕获组，\\1本身可以出现在捕获组中，貌似只能引用前面的捕获组，如果使用后面的捕获组，会显示未解析 */
        String regex = "^ (\\d*) (\\13) (\\24) (\\d*) $";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配：" + m.matches());
        System.out.println("捕获组数量：" + m.groupCount());
        for (int i = 1; i <= m.groupCount(); i++) {
            System.out.println("第" + i + "个捕获组为：" + m.group(i) + "，长度为：" + m.group(i).length());
        }
    }



}
