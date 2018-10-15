package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 空格匹配测试 */
public class SpaceTest {

    public static void main(String[] args){

        String content = "  a b   c d ";

        /* \在java字符串中为转义字符，不能单独使用，这里的\\起到一个正则转义元字符的作用，在正则表达式中s代表了字母s，\s则代表空白字符 */
        String regex = "^(\\s+)a(\\s+)b(\\s+)c(\\s+)d(\\s+)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配："+m.matches());
        System.out.println("捕获组数量："+m.groupCount());
        for(int i=1;i<=m.groupCount();i++){
            System.out.println("第"+i+"个捕获组为："+m.group(i)+"，长度为："+m.group(i).length());
        }

    }

}
