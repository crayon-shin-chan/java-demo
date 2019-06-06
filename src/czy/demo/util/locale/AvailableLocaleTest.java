package czy.demo.util.locale;


import java.util.Locale;

/* 本地化测试 */
public class AvailableLocaleTest {

    public static void main(String[] args){
        for(Locale locale:Locale.getAvailableLocales()){
            System.out.println("获取本地化对象："+locale.toString());
        }
    }

}
