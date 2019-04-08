package czy.demo.util.encode.url;

import java.net.URLDecoder;
import java.net.URLEncoder;

/* URL encoder测试 */
public class URLEncoderTest {

    public static void main(String[] args)throws Exception{
        String url = "http://baidu.com?a=张三&b=2";
        String utf8 = URLEncoder.encode(url,"utf-8");
        String gbk = URLEncoder.encode(url,"gbk");

        System.out.println("utf-8编码结果为："+utf8);
        System.out.println("gbk编码结果为："+gbk);

        System.out.println("utf-8解码结果为："+ URLDecoder.decode(utf8,"utf-8"));
        System.out.println("gbk解码结果为："+ URLDecoder.decode(gbk,"gbk"));
    }

}
