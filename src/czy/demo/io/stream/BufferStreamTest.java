package czy.demo.io.stream;

import java.io.*;
import java.util.Date;

/* 缓冲流，为包装器流，即可以包装另一个流，如文件流、字节流等
   读取时内部会一次读取一个缓存块，我们的代码从它内部的缓存进行读取，真实io发生的频率
   写出时，首先会写入内部的缓存块，缓存满时才会发生真实io
 */
public class BufferStreamTest {

    public static void main(String[] args)throws Exception{

        /* 60毫秒 */
        say("使用普通文件流读取文件：");
        Date date1 = new Date();
        read1("src/czy/demo/io/stream/BufferStreamTest.java");
        Date date2 = new Date();
        say("耗时："+(date2.getTime()-date1.getTime())+"毫秒");
        say("");

        /* 1毫秒 */
        say("使用缓冲流读取文件：");
        Date date3 = new Date();
        read2("src/czy/demo/io/stream/BufferStreamTest.java");
        Date date4 = new Date();
        say("耗时："+(date4.getTime()-date3.getTime())+"毫秒");
        say("");

        String content = "这是新的文件内容，为了测试效果明显，特意加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长加长";

        /* 21毫秒 */
        say("使用普通文件流写入文件：");
        Date date5 = new Date();
        write1("a.txt",content);
        Date date6 = new Date();
        say("耗时："+(date6.getTime()-date5.getTime())+"毫秒");
        say("");

        /* 4毫秒 */
        say("使用缓冲流写入文件：");
        Date date7 = new Date();
        write2("b.txt",content);
        Date date8 = new Date();
        say("耗时："+(date8.getTime()-date7.getTime())+"毫秒");
        say("");

    }

    /* 使用普通流读取 */
    public static void read1(String path)throws IOException {
        InputStream in = new FileInputStream(path);
        byte[] buffer = new byte[1];
        while(in.read(buffer,0,1)!=-1){
        }
        in.close();
    }

    /* 使用缓冲流读取 */
    public static void read2(String path)throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(path), 1024);
        byte[] buffer = new byte[1];
        while (in.read(buffer, 0, 1) != -1) {
        }
        in.close();
    }

    /* 使用普通流写入 */
    public static void write1(String path,String content)throws IOException{
        OutputStream out = new FileOutputStream(path);
        for(byte b:content.getBytes()){
            out.write(b);
        }
        out.close();
    }

    /* 使用缓冲流写入 */
    public static void write2(String path,String content)throws IOException{
        OutputStream out = new BufferedOutputStream(new FileOutputStream(path),1048);
        for(byte b:content.getBytes()){
            out.write(b);
        }
        out.close();
    }

    public static void say(Object o ){
        System.out.println(o);
    }
}
