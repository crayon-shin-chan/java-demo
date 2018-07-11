package czy.demo.crypto.rsa;

import java.math.BigInteger;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSATest {

    private static byte[] content = "我是被签名的内容".getBytes();

    private static PrivateKey private_key ;

    private static PublicKey public_key;

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
        }catch(Exception ex){

        }

    }


    public static void main(String[] args)throws Exception{

        String sign = md5Sign(content);
        say("签名字符串为："+sign);
        say("验签结果为："+md5Verify(sign,content));
    }

    public static void say(Object o){
        System.out.println(o);
    }

    public static String md5Sign(byte[] data)throws Exception{
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(private_key);
        signature.update(data);
        return Base64.getEncoder().encodeToString(signature.sign());
    }

    public static boolean md5Verify(String s,byte[] data)throws Exception{
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initVerify(public_key);
        signature.update(data);
        return signature.verify(Base64.getDecoder().decode(s));
    }
}
