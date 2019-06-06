package czy.demo.security.crypto.symmetry;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;

/* 3DES又称Triple DES，是DES加密算法的一种模式，它使用3条56位的密钥对3DES数据进行三次加密。 */
public class DESedeTest {

    /* 对称加密key生成器，为KeyGenerator
     * 非对称加密key生成器，为KeyPairGenerator
     */
    private static KeyGenerator keyGenerator ;

    /* 对称加密秘钥，只有一个，由SecretKey存储
     * 非对称加密，密钥对由KeyPair存储
     */
    private static SecretKey secretKey ;

    private static Cipher cipher ;

    private static Base64.Encoder encoder = Base64.getEncoder();

    private static Base64.Decoder decoder = Base64.getDecoder();

    static{
        try{
            keyGenerator = KeyGenerator.getInstance("DESede");
            secretKey = keyGenerator.generateKey();
            cipher = Cipher.getInstance("DESede");
        }catch(Exception ex){

        }
    }

    public static void main(String[] args)throws Exception{
        String encrypt = encrytor("我是被加密内容"+new Date().toString());
        System.out.println("解密内容为："+decryptor(encrypt));
    }

    public static String encrytor(String content)throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        return encoder.encodeToString(cipher.doFinal(content.getBytes()));
    }

    public static String decryptor(String encrypt)throws Exception{
        cipher.init(Cipher.DECRYPT_MODE,secretKey);
        return new String(cipher.doFinal(decoder.decode(encrypt)));
    }

}
