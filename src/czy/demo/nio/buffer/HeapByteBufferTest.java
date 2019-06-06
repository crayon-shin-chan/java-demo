package czy.demo.nio.buffer;

import java.nio.ByteBuffer;

/* 基于堆内存的字节缓冲区示例，内部使用字节数组操作缓存 */
public class HeapByteBufferTest {

    public static void main(String[] args){
        ByteBuffer buffer = ByteBuffer.allocate(20);
        for(int i=0;i<buffer.limit();i+=2){
            buffer.putChar(i,(char)('a'+i));
        }
        ByteBufferPrint.print(buffer);
    }

}
