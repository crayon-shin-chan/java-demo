package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 捕获组示例 */
public class CaptureTest {

    public static void main(String[] args){

        String content = " 12  34 ";

        /* 捕获组可以互相嵌套，大的首先遇到的捕获组在前面 */
        String regex = "^ ((\\d*)(\\s*))(\\d*)(\\s*)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配：" + m.matches());
        System.out.println("捕获组数量：" + m.groupCount());
        for (int i = 1; i <= m.groupCount(); i++) {
            System.out.println("第" + i + "个捕获组为：" + m.group(i) + "，长度为：" + m.group(i).length());
        }
    }


}
