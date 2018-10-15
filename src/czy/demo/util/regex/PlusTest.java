package czy.demo.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 元字符+示例,+代表了1个或者多个，不匹配0个 */
public class PlusTest {

    public static void main(String[] args){
        //String content = "123,5,4,56";
        String content = "123,,4,56";
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
