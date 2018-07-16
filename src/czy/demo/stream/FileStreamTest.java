package czy.demo.stream;

import java.io.*;
import java.util.Date;

public class FileStreamTest {


    public static void main(String[] args)throws Exception{
        read("src/czy/demo/stream/FileStreamTest.java");
        write("a.txt","我是文件内容"+new Date().toLocaleString());
    }

    /* 读取文件时，只能一次读取一个指定大小的字节数组 */
    public static void read(String path)throws IOException {

        InputStream in = new FileInputStream(path);

        /* 读取的字节缓存，以及一次读取的大小 */
        byte[] buffer = new byte[2048];
        int length;

        say("准备输出文件：");

        /* 读取返回-1时，说明到文件结尾 */
        while((length = in.read(buffer,0,2048))!=-1){

            /* 一次不一定将缓存读满，只有长度为length的字节是可用的，其他都是初始化数据 */
            say(new String(buffer,0,length));

        }

        say("输出文件结束");
        in.close();
    }

    public static void write(String path,String content)throws IOException{
        OutputStream out = new FileOutputStream(path);
        out.write(content.getBytes());
        out.close();
    }

    public static void say(Object o ){
        System.out.println(o);
    }
}
