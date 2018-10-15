package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 非单词边界匹配，本身不是任何字符，而是代表一个字符与字符之间的边界 */
public class NotWordBoundaryTest {

    public static void main(String[] args){

        String content = "abab ";

        /* 由于\\B代表非单词边界，此处匹配ab */
        String regex = "^(.*ab\\B).*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配：" + m.matches());
        System.out.println("捕获组数量：" + m.groupCount());
        for (int i = 1; i <= m.groupCount(); i++) {
            System.out.println("第" + i + "个捕获组为：" + m.group(i) + "，长度为：" + m.group(i).length());
        }
    }

}
