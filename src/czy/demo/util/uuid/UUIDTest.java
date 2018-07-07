package czy.demo.util.uuid;


import java.util.UUID;

/* uuid表示不可变通用唯一标识符，128位二进制值
 * uuid存在各种不同变体，这个类的方法用于操纵Leach Salz变体，构造函数允许创造各种变体
 * uuid变体2 Leach Salz的布局如下：
 * 最重要的长度包括以下无符号字段：
 * 0xFFFFFFFF00000000 time_low，低位时间，8位16进制数
 * 0x00000000FFFF0000 time_mid，中位时间，4位16进制数
 * 0x000000000000F000 version，版本，1位16进制数
 * 0x0000000000000FFF time_hi，高位时间，3位16进制数
 *
 * 版本：标识uuid类型，目前有四种类型，1：基于时间的，2：DCE安全的，3：基于命名的:4：随机的
 *
 * 最不重要的长整数包括以下无符号字段：
 * 0xC000000000000000 variant，变体类型
 * 0x3FFF000000000000 clock_seq，时钟序列
 * 0x0000FFFFFFFFFFFF node，节点
 * uuid是32位小写字母数字短横线组成的字符串，如c485dc54-1cd7-4f0a-9983-fa5b5f3384ab
 * 其中短横线位置是固定的，其他位是数字还是小写字母是随机的
  * */
public class UUIDTest {

    public static void main(String[] args){

        /* 随机生成一个UUID对象，一般使用这个方法，直接生成的uuid只是个UUID对象，还不是字符串 */
        UUID random = UUID.randomUUID();

        /* 参数分别为高64位与低64位值，这样的uuid不知道是什么版本的 */
        UUID bit = new UUID(12121212,23232323);

        byte[] bytes = new byte[10];
        for(int i=0;i<bytes.length;i++){
            bytes[i] = (byte)(i+1);
        }
        /* 参数为字节，获取命名UUID */
        UUID name = UUID.nameUUIDFromBytes(bytes);

        /* 转换为字符串 */
        System.out.println("随机uuid为："+random.toString());
        System.out.println("构造uuid为："+bit.toString());
        System.out.println("命名uuid为："+name.toString());

        System.out.println("随机hashCode为："+random.hashCode());
        System.out.println("构造hashCode为："+bit.hashCode());
        System.out.println("命名hashCode为："+name.hashCode());

        System.out.println("随机uuid版本为："+random.version());
        System.out.println("构造uuid版本为："+bit.version());
        System.out.println("命名uuid版本为："+name.version());

    }
}
