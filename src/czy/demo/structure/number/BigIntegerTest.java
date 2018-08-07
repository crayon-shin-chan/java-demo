package czy.demo.structure.number;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args){

        /**
         *  使用字节数组构造BigInteger
         *  则字节数组被转换为二进制字符串，并且拼接起来，高位在前，低位在后
         */
        byte[] bytes = {12,23,45};
        BigInteger big1 = new BigInteger(bytes);
        say("值为1的二进制位个数为：："+big1.bitCount());
        say("总的二进制位个数为(开头的0不算)："+big1.bitLength());
        say("转换为2进制字符串为："+big1.toString(2));
        say("转换为8进制字符串为："+big1.toString(8));
        say("转换为10进制字符串为："+big1.toString(10));
        say("转换为16进制字符串为："+big1.toString(16));
        say("转换为默认值："+big1.toString());

    }

    public static void say(Object o){
        System.out.println(o);
    }


}
