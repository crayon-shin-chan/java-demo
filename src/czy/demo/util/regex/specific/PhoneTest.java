package czy.demo.util.regex.specific;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 手机号正则匹配 */
public class PhoneTest {

    public static void main(String[] args){

        /* 目前大陆手机号普遍为1开头，第二位34578，一共11个数字，其中第二位为4时只有两种匹配34 37 */
        String regex = "^((13|15|17|18)\\d{9})|(14[57]\\d{8})$";

        String phone1 = "28402933805";
        String phone2 = "12402933805";
        String phone3 = "1840293380";
        String phone4 = "18402933809";

        System.out.println(phone1+"是否匹配："+phone1.matches(regex));
        System.out.println(phone2+"是否匹配："+phone2.matches(regex));
        System.out.println(phone3+"是否匹配："+phone3.matches(regex));
        System.out.println(phone4+"是否匹配："+phone4.matches(regex));
    }


}
