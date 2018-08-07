package czy.demo.structure.number;

/* 整数计算测试类 */
public class IntTest {

    public static void main(String[] args){
        int a = 1234567890;
        /* 不能将过大整数赋值给int，int最大就是10位数 */
        int b = 1234567890;

        long c = 1234567890;

        /* 结果为：-539222988，由于int乘以int值，结果依然转化为int值，因为超出所以变为负值 */
        say(a*10+"");

        /* 结果依然为负，因为计算时已经被强制转换，后来再转换为long无意义 */
        say((long)(a*10)+"");

        /* 结果为：12345678900，因为一个乘数为long，所以结果按照long计算，正确 */
        say(a*10L+"");

        /* 结果为：-1825831516，超出为负 */
        say((a+b)+"");

        /* 结果依然为负，因为计算时已经被强制转换，后来再转换为long无意义 */
        say((long)(a+b)+"");

        /* 结果为：2469135780，一个加数为long，结果正确 */
        say((a+c)+"");
    }

    public static void say(String s){
        System.out.println(s);
    }

}
