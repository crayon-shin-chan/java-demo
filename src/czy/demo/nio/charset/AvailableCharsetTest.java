package czy.demo.nio.charset;


import java.nio.charset.Charset;
import java.util.Map;

/* 好多字符集 */
public class AvailableCharsetTest {

    public static void main(String[] args){
        Map<String,Charset> charsetMap = Charset.availableCharsets();
        for(Map.Entry<String,Charset> entry:charsetMap.entrySet()){
            say("字符集名称为："+entry.getKey());
            CharsetPrint.print(entry.getValue());
        }
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
