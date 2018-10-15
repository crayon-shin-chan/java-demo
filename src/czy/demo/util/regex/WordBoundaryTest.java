package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* \\w匹配任何字类字符，包括下划线,与"[A-Za-z0-9_]"等效,\\b匹配一个单词的边界，其本身不是任何字符，而是一个单词字符与空白之间的边界，既不是字符也不是空白 */
public class WordBoundaryTest {

    public static void main(String[] args){

        String content = " dog pig ";

        String regex = "^\\s*(\\w*(\\b))\\s*(\\w*\\b)\\s*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配：" + m.matches());
        System.out.println("捕获组数量：" + m.groupCount());
        for (int i = 1; i <= m.groupCount(); i++) {
            System.out.println("第" + i + "个捕获组为：" + m.group(i) + "，长度为：" + m.group(i).length());
        }
    }

}
