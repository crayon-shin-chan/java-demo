package czy.demo.util.regex.specific;

/* 固定电话测试 */
public class FixedPhoneTest {

    public static void main(String[] args){
        /* 区域号+座机号码+分机号码，没看懂 */
        String regex = "(?:(\\(\\+?86\\))(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)|" +
                "(?:(86-?)?(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)";

        String phone1 = "029-83763840";
        String phone2 = "0291-93763840"; // 区域号应该以0开头，3-4位
        String phone3 = "02983763840"; // 区域号后面可以不带分隔符

        System.out.println(phone1+"是否匹配："+phone1.matches(regex));
        System.out.println(phone2+"是否匹配："+phone2.matches(regex));
        System.out.println(phone3+"是否匹配："+phone3.matches(regex));
    }

}
