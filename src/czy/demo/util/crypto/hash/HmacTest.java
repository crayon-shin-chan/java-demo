package czy.demo.util.crypto.hash;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;

public class HmacTest {

    public static void main(String[] s)throws Exception{
        /* 这三种算法是支持的 */
        d("HmacMd5");
        d("HmacSHA1");
        d("HmacSHA256");
    }

    public static void d(String s)throws Exception{
        SecretKey key = new SecretKeySpec("我是秘钥".getBytes(),s);
        Mac mac = Mac.getInstance(s);
        mac.init(key);
        byte[] bytes = mac.doFinal("我是被签名的字符串".getBytes());
        say("HmacMD5签名为："+new BigInteger(1,bytes).toString(16));
    }

    public static void say(String s){
        System.out.println(s);
    }

}
