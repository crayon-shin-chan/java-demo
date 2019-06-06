package czy.demo.nio.buffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* 字节缓冲区打印 */
public class ByteBufferPrint {

    public static void print(ByteBuffer byteBuffer){
        say("实现类为："+byteBuffer.getClass().getName());
        if(byteBuffer.hasArray()){
            say("由数组支持，数组为："+ Arrays.toString(byteBuffer.array()));
        }
        if(byteBuffer.isDirect()){
            say("由直接内存分配支持");
        }
        say("字符输出：");
        while (byteBuffer.hasRemaining()){
            say("第"+byteBuffer.position()+"字符为："+byteBuffer.getChar());
        }
        byteBuffer.clear();
        say("字节输出：");
        while (byteBuffer.hasRemaining()){
            say("第"+byteBuffer.position()+"字节为："+byteBuffer.get());
        }
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
