package czy.demo.encode.base64;

import java.util.Base64;

/* base64编码有三种类型,分别为
 * 基本类型: basic,生成的字符串里面只有+
 * url类型: url,生成的字符串所有里面没有+,全是_
 * mime类型: mime,与basic一样
 *
  * */
public class BASE64Test {

    private static byte[] bytes = "这是base64测试字符串,呵呵".getBytes();

    /* 获取基本的base64编码器 */
    private static Base64.Encoder encoder = Base64.getEncoder();

    /* 获取url的base64编码器 */
    private static Base64.Encoder urlEncoder = Base64.getUrlEncoder();

    /* 获取mime的base64编码器 */
    private static Base64.Encoder mimeEncoder = Base64.getMimeEncoder();

    private static Base64.Decoder decoder = Base64.getDecoder();

    private static Base64.Decoder urlDecoder = Base64.getUrlDecoder();

    private static Base64.Decoder mimeDecoder = Base64.getMimeDecoder();

    public static void main(String[] args){

        String basic = encoder.encodeToString(bytes);
        System.out.println("生成basic编码为:"+basic);

        /* 生成的base64字符串与上面一样 */
        String url = urlEncoder.encodeToString(bytes);
        System.out.println("生成url编码为:"+url);

        String mime = mimeEncoder.encodeToString(bytes);
        System.out.println("生成mime编码为:"+mime);

        System.out.println("源字节为:");
        printBytes(bytes);

        byte[] basicBytes = decoder.decode(basic);
        System.out.println("解码的basic字节为:");
        printBytes(basicBytes);

        byte[] urlBytes = urlDecoder.decode(url);
        System.out.println("解码的url字节为:"+urlBytes);
        printBytes(urlBytes);

        byte[] mimeBytes = mimeDecoder.decode(mime);
        System.out.println("解码的mime字节为:");
        printBytes(mimeBytes);
    }

    private static void printBytes(byte[] bytes){
        for(byte b:bytes){
            System.out.print(b+" ");
        }
        System.out.println();
    }

}
