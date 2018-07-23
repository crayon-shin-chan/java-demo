package czy.demo.encode.utf8;

import java.nio.charset.Charset;

public class UTF8Test {

    public static void main(String[] args){
        String s = "我是UTF-8字符串";
        Charset set1 = Charset.forName("utf-8");
        Charset set2 = Charset.forName("gbk");
        byte[] utf8 = s.getBytes(set1);
        byte[] gbk = s.getBytes(set2);
        say(utf8);
        say(gbk);
        println("uft8字节转换回utf8字符串为："+new String(utf8,set1));
        println("gbk字节转换回gbk字符串为："+new String(gbk,set2));
        println("uft8字节转换回gbk字符串为："+new String(utf8,set2));
        println("gbk字节转换回utf8字符串为："+new String(gbk,set1));
    }

    public static void say(byte[] bytes){
        for(byte b:bytes){
            System.out.print(b);
        }
        System.out.println("");
    }

    public static void println(String s){
        System.out.println(s);
    }

}
