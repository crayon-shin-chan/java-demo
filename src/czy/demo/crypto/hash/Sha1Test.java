package czy.demo.crypto.hash;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Sha1Test {

    public static void main(String[] args)throws Exception{
        MessageDigest sha1 = MessageDigest.getInstance("SHA1");
        say("哈希算法为："+sha1.getAlgorithm());
        say("哈希算法长度为："+sha1.getDigestLength());
        say("哈希算法供应商为："+sha1.getProvider().getName()+":"+sha1.getProvider().getInfo());
        byte[] bytes = sha1.digest("我是被签名的字符串".getBytes());
        say("签名后字符串为："+new BigInteger(1,bytes).toString(16));
    }

    public static void say(String s){
        System.out.println(s);
    }
}
