package czy.demo.security.crypto.hash;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Sha256Test {

    public static void main(String[] args)throws Exception{
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        say("哈希算法为："+sha256.getAlgorithm());
        say("哈希算法长度为："+sha256.getDigestLength());
        say("哈希算法供应商为："+sha256.getProvider().getName()+":"+sha256.getProvider().getInfo());
        byte[] bytes = sha256.digest("我是被签名的字符串".getBytes());
        say("签名后字符串为："+new BigInteger(1,bytes).toString(16));
    }

    public static void say(String s){
        System.out.println(s);
    }
}
