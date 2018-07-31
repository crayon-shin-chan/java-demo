package czy.demo.number;

import java.math.BigDecimal;

public class BigDicemalTest {

    public static void main(String[] args){

        /* 可以直接使用字符数组来构造大的定点小数 */
        BigDecimal big = new BigDecimal("112121221212.212121212121212".toCharArray());
        System.out.println("double值为："+big.doubleValue());
        System.out.println("float值为："+big.floatValue());
        System.out.println("转换为字符串为："+big.toString());
        System.out.println();
    }

}
