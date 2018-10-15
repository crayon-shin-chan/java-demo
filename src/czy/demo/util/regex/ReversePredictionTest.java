package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 反向预测搜索测试 */
public class ReversePredictionTest {

    public static void main(String[] args){

        String content = "windows nt ";

        /* (?!=2000)代表反向匹配先行搜索表达式，本身不包含在捕获组中，但是可以预先搜索windows之后的字符，来确定windows这个捕获组是否匹配，且其并不会占用字符，后面的匹配还是从2000开始 */
        /* 反向预测的意思是，后面的预测字符不匹配指定模式 */
        String regex = "^(windows (?!=2000))(.*)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        System.out.println("是否匹配：" + m.matches());
        System.out.println("捕获组数量：" + m.groupCount());
        for (int i = 1; i <= m.groupCount(); i++) {
            System.out.println("第" + i + "个捕获组为：" + m.group(i) + "，长度为：" + m.group(i).length());
        }
    }

}
