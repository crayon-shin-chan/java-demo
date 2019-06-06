package czy.demo.security.crypto.rsa;

import java.security.*;
import java.util.Base64;

public class RSATest {

    private static byte[] content = "我是被签名的内容".getBytes();

    private static PrivateKey private_key ;

    private static PublicKey public_key;

    private static Base64.Encoder encoder = Base64.getEncoder();

    private static Base64.Decoder decoder = Base64.getDecoder();

    static{
        try{
            /* 密钥对生成器 */
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
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

        String md5Sign = md5Sign(content);
        say("md5签名字符串为："+md5Sign);
        say("md5验签结果为："+md5Verify(md5Sign,content));

        String sha1Sign = sha1Sign(content);
        say("sha1签名字符串为："+sha1Sign);
        say("sha1验签结果为："+sha1Verify(sha1Sign,content));

        String sha256Sign = sha256Sign(content);
        say("sha256签名字符串为："+sha256Sign);
        say("sha256验签结果为："+sha256Verify(sha256Sign,content));

        String sha384Sign = sha384Sign(content);
        say("sha384签名字符串为："+sha384Sign);
        say("sha384验签结果为："+sha384Verify(sha384Sign,content));

        String sha512Sign = sha512Sign(content);
        say("sha512签名字符串为："+sha512Sign);
        say("sha512验签结果为："+sha512Verify(sha512Sign,content));
    }

    public static void say(Object o){
        System.out.println(o);
    }

    public static String md5Sign(byte[] data)throws Exception{
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(private_key);
        signature.update(data);
        return encoder.encodeToString(signature.sign());
    }

    public static boolean md5Verify(String s,byte[] data)throws Exception{
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initVerify(public_key);
        signature.update(data);
        return signature.verify(decoder.decode(s));
    }

    public static String sha1Sign(byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initSign(private_key);
        signature.update(data);
        return encoder.encodeToString(signature.sign());
    }

    public static boolean sha1Verify(String s,byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initVerify(public_key);
        signature.update(data);
        return signature.verify(decoder.decode(s));
    }

    public static String sha256Sign(byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(private_key);
        signature.update(data);
        return encoder.encodeToString(signature.sign());
    }

    public static boolean sha256Verify(String s,byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(public_key);
        signature.update(data);
        return signature.verify(decoder.decode(s));
    }

    public static String sha384Sign(byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA384withRSA");
        signature.initSign(private_key);
        signature.update(data);
        return encoder.encodeToString(signature.sign());
    }

    public static boolean sha384Verify(String s,byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA384withRSA");
        signature.initVerify(public_key);
        signature.update(data);
        return signature.verify(decoder.decode(s));
    }

    public static String sha512Sign(byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA512withRSA");
        signature.initSign(private_key);
        signature.update(data);
        return encoder.encodeToString(signature.sign());
    }

    public static boolean sha512Verify(String s,byte[] data)throws Exception{
        Signature signature = Signature.getInstance("SHA512withRSA");
        signature.initVerify(public_key);
        signature.update(data);
        return signature.verify(decoder.decode(s));
    }
}
