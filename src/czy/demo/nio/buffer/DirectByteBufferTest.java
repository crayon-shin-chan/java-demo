package czy.demo.nio.buffer;

import java.nio.ByteBuffer;

/* 直接分配的字节缓冲区示例
 * 直接分配的意思是不使用中间数据结构，直接使用UnSafe类操作内存
 */
public class DirectByteBufferTest {

    public static void main(String[] args){
        ByteBuffer buffer = ByteBuffer.allocateDirect(20);
        ByteBufferPrint.print(buffer);
    }

}
