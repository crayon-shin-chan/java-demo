package czy.demo.util.regex.specific;

/* 电子邮箱正则匹配 */
public class EmailTest {

    public static void main(String[] args){

        /* @符后面有.，.后面最少有两个字符 */
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

        String email1 = "1253665625@qq.com";
        String email2 = "1253665625@qq.cn";
        String email3 = "1253665625@qq.c";
        String email4 = "1253665625";

        System.out.println(email1+"是否匹配："+email1.matches(regex));
        System.out.println(email2+"是否匹配："+email2.matches(regex));
        System.out.println(email3+"是否匹配："+email3.matches(regex));
        System.out.println(email4+"是否匹配："+email4.matches(regex));

    }

}
