package czy.demo.nio.buffer;

import java.nio.ByteBuffer;

/* 直接分配的字节缓冲区示例
 * 直接分配的意思是不使用中间数据结构，直接使用UnSafe类操作内存
 * 不使用JVM堆栈而是通过操作系统来创建内存块用作缓冲区
 * 它与当前操作系统能够更好的耦合，因此能进一步提高I/O操作速度
 * 但是分配直接缓冲区的系统开销很大，因此只有在缓冲区较大并长期存在，或者需要经常重用时，才使用这种缓冲区
 */
public class DirectByteBufferTest {

    public static void main(String[] args){
        ByteBuffer buffer = ByteBuffer.allocateDirect(20);
        ByteBufferPrint.print(buffer);
    }

}
