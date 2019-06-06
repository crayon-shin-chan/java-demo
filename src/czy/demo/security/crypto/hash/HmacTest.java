package czy.demo.security.crypto.hash;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;

/* Hmac是一种带密钥的单向签名算法，只能生成密文，不能由密文得到原文 */
public class HmacTest {

    private static final String md5 = "HmacMD5";
    private static final String sha1 = "HmacSHA1";
    private static final String sha256 = "HmacSHA256";

    private static SecretKey key ;
    private static Mac mac ;

    static{
        try{
            key = new SecretKeySpec("我是秘钥".getBytes(),md5);
            mac = Mac.getInstance(md5);
            mac.init(key);
        }catch(Exception ex){

        }
    }

    public static void main(String[] s)throws Exception{
        /* 这三种算法是支持的 */
        d();
    }

    public static void d()throws Exception{

        /* 加密可以进行多次 */
        byte[] bytes = mac.doFinal("我是被签名的字符串".getBytes());
        say("HmacMD5签名为："+new BigInteger(1,bytes).toString(16));

        bytes = mac.doFinal("我是被签名的字符串".getBytes());
        say("HmacMD5签名为："+new BigInteger(1,bytes).toString(16));
    }

    public static void say(String s){
        System.out.println(s);
    }

}
