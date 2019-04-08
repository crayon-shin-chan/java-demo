package czy.demo.util.regex.specific;

/* 邮政编码测试 */
public class PostCodeTest {

    public static void main(String[] args){

        /* 邮政编码第一位不能为0，一共6位数字 */
        String regex = "[1-9]\\d{5}";

        String code1 = "710600";

        System.out.println(code1+"是否匹配："+code1.matches(regex));
    }

}
