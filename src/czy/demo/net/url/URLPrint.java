package czy.demo.net.url;

import java.io.BufferedInputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class URLPrint {

    public static void print(URL url)throws Exception{
        /* path为域名端口之后部分 */
        say("URL路径为："+url.getPath());
        /* 授权包含用户密码、域名端口 */
        say("URL授权为："+url.getAuthority());
        /* 文件为域名后面部分 */
        say("URL文件为："+url.getFile());
        say("URL域名为："+url.getHost());
        say("URL协议为："+url.getProtocol());
        /* 查询字符串为问号后面部分 */
        say("URL查询字符串为："+url.getQuery());
        say("URL引用为："+url.getRef());
        /* 用户信息为user:password */
        say("URL用户信息为："+url.getUserInfo());

        URLConnection con = url.openConnection();
        say("连接之前是否可输入："+con.getDoInput());
        say("连接之前是否可输出："+con.getDoOutput());

        con.connect();
        say("连接之后是否可输入："+con.getDoInput());
        say("连接之后是否可输出："+con.getDoOutput());

        say("响应编码为："+con.getContentEncoding());
        say("响应内容类型为："+con.getContentType());
        say("响应日期为："+new Date(con.getDate()).toGMTString());
        say("响应过期时间为："+new Date(con.getExpiration()).toGMTString());
        say("响应内容长度为："+con.getContentLengthLong());
        say("响应最后修改时间为："+new Date(con.getLastModified()).toGMTString());

        /* 获取到的响应头有这样一条null:HTTP/1.1 200，即响应码与协议也是在响应头中的 */
        say("获取到响应头为：");
        Map<String, List<String>> headers = con.getHeaderFields();
        for(Map.Entry<String,List<String>> entry:headers.entrySet()){
            StringBuilder builder = new StringBuilder(entry.getKey()+":");
            for(String s:entry.getValue()){
                builder.append(s+",");
            }
            say(builder.toString());
        }

        say("获取到响应内容为：");
        byte[] buffer = new byte[6048];
        int length;
        BufferedInputStream in = new BufferedInputStream(con.getInputStream());
        while((length = in.read(buffer,0,1048))!=-1){
            say(new String(buffer,0,length));
        }
    }

    public static void say(Object o ){
        System.out.println(o);
    }

}
