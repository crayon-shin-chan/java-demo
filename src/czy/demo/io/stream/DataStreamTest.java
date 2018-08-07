package czy.demo.io.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DataStreamTest {

    /* Data流可以直接写入boolean等原始类型数据，每个原始类型数据存储格式是固定的
     * 所以读取时需要按照写入顺序读取，才能获取原值，先写先读，后写后读
     */
    public static void main(String[] args)throws Exception{
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(out1);
        out.writeBoolean(true);
        out.writeByte(20);
        out.writeChar('c');
        out.writeShort(100);
        out.writeInt(43434);
        out.writeLong(4334343434L);
        out.writeFloat(1212.1f);
        out.writeDouble(32323.2121);
        out.close();

        DataInputStream in  = new DataInputStream(new ByteArrayInputStream(out1.toByteArray()));
        say("写入boolean为："+in.readBoolean());
        say("写入byte为："+in.readByte());
        say("写入char为："+in.readChar());
        say("写入short为："+in.readShort());
        say("写入int为："+in.readInt());
        say("写入long为："+in.readLong());
        say("写入float为："+in.readFloat());
        say("写入double为："+in.readDouble());
        in.close();
    }

    public static void say(Object o ){
        System.out.println(o);
    }

}
