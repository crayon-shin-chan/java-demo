package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 元字符|示例 */
public class OrTest {

    public static void main(String[] args){

        String content = " 12 34 ";

        /* |可以起到或的作用(12|34)代表12或者34，而不是124或者134 */
        String regex = "^ (12|34) (12|34) $";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配：" + m.matches());
        System.out.println("捕获组数量：" + m.groupCount());
        for (int i = 1; i <= m.groupCount(); i++) {
            System.out.println("第" + i + "个捕获组为：" + m.group(i) + "，长度为：" + m.group(i).length());
        }
    }

}
