package czy.demo.encode.utf8;

import java.nio.charset.Charset;

public class UTF8Test {

    public static void main(String[] args){
        String s = "我是UTF-8字符串";
        Charset set1 = Charset.forName("utf-8");
        Charset set2 = Charset.forName("gbk");
        byte[] utfs = s.getBytes(set1);
        byte[] gbk = s.getBytes(set2);
        say(utfs);
        say(gbk);
        println("uft8字节转换回字符串为："+new String(utfs,set1));
        println("gbk字节转换回字符串为："+new String(gbk,set2));
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
