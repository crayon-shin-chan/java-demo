package czy.demo.util.crypto.rsa;

import java.security.*;
import java.util.Base64;

/**
 * 注意：这里明文、密文，都是字节数组，字符串只是表现形式而已
 * 一般由于二进制字符串不好看，都是使用BASE64对字符串进行编码
 * DSA非对称加密方式的秘钥算法与签名算法都是DSA
 */
public class DSATest {

    private static byte[] content = "我是被签名的内容".getBytes();

    private static PrivateKey private_key ;

    private static PublicKey public_key;

    private static Base64.Encoder encoder = Base64.getEncoder();

    private static Base64.Decoder decoder = Base64.getDecoder();

    static{
        try{
            /* 密钥对生成器 */
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");

            /* 初始化秘钥位数，1024或2048 */
            keyPairGenerator.initialize(1024);

            /* 生成的密钥对 */
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            /* 生成的公钥 */
            public_key = keyPair.getPublic();

            /* 生成的私钥 */
            private_key = keyPair.getPrivate();

            say("生成的公钥为："+encoder.encodeToString(public_key.getEncoded()));

            say("生成的私钥为："+encoder.encodeToString(private_key.getEncoded()));

        }catch(Exception ex){

        }

    }


    public static void main(String[] args)throws Exception{

        String sign = sign(content);
        say("md5签名字符串为："+sign);
        say("md5验签结果为："+verify(sign,content));

    }

    public static void say(Object o){
        System.out.println(o);
    }

    public static String sign(byte[] data)throws Exception{
        Signature signature = Signature.getInstance("DSA");
        signature.initSign(private_key);
        signature.update(data);
        return encoder.encodeToString(signature.sign());
    }

    public static boolean verify(String s,byte[] data)throws Exception{
        Signature signature = Signature.getInstance("DSA");
        signature.initVerify(public_key);
        signature.update(data);
        return signature.verify(decoder.decode(s));
    }

}