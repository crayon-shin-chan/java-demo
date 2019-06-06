package czy.demo.security.crypto.hash;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Md5Test {


    public static void main(String[] args)throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        say("哈希算法为："+md5.getAlgorithm());
        say("哈希算法长度为："+md5.getDigestLength());
        say("哈希算法供应商为："+md5.getProvider().getName()+":"+md5.getProvider().getInfo());
        byte[] bytes = md5.digest("我是被签名的字符串".getBytes());
        say("签名后字符串为："+new BigInteger(1,bytes).toString(16));
    }

    public static void say(String s){
        System.out.println(s);
    }
}
