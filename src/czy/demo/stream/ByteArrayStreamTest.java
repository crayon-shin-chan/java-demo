package czy.demo.stream;

import java.io.*;

public class ByteArrayStreamTest {

    public static void main(String[] args)throws IOException {
        String content = "呵呵呵呵呵呵呵呵呵这又是一个测试字符串，最好很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长";
        InputStream in = new ByteArrayInputStream(content.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[10];
        int length;
        while((length = in.read(buffer,0,10))!=-1){
            out.write(buffer,0,length);
        }
        in.close();
        out.close();
        System.out.println("字节数组输出流的字节数组为：");
        for(byte b:out.toByteArray()){
            System.out.print(b);
        }
        System.out.println("");
        System.out.println("字节数组输出流生成的字符串为：");
        System.out.println(out.toString());
    }


}
