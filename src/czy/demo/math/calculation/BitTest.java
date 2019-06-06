package czy.demo.math.calculation;

/**
 * 字节操作测试类
 * 字节操作运算符：
 * &：且运算符，将运算符两边数字转换为二进制形式，每一位分别进行且运算，返回结果
 * |：或运算符，将运算符两边数字转换为二进制形式，每一位分别进行或运算，返回结果
 * ~：取反运算符：将数字转换为二进制形式，每一位分别取反，返回结果
 * ^：异或运算符，将运算符两边数字转换为二进制形式，每一位分别异或，返回结果
 * 参与运算的数可以是任何整型数据，返回数据也是整型，要输出必须使用toBinaryString
 */
public class BitTest {

    public static void main(String[] args){

        /* 使用0b开头的是二进制数 */
        int a = 0b10101010;

        say("打印原二进制数");
        say(a);
        say(Integer.toBinaryString(a));
        say(null);

        say("进行且运算");
        say(a&0b11110000);
        say(Integer.toBinaryString(a&0b11110000));
        say(null);

        say("进行或运算");
        say(a|0b11110000);
        say(Integer.toBinaryString(a|0b11110000));
        say(null);

        say("进行异或运算");
        say(a^0b11110000);
        say(Integer.toBinaryString(a^0b11110000));
        say(null);

        say("进行取反运算");
        say(~a);
        say(Integer.toBinaryString(~a));
        say(null);

        /**
         * 据说右移运算符>>与>>>在补位上会有区别，但是还没测出来
         * 负数移位效果很奇怪
         * 操作int时，移动的位数会对32取模，如3与35移动效果是一样的，因为int本身就是32位二进制数
         * 操作long时，移动的位数会对64取模，因为long为64位二进制数
         */
        say("进行右移运算运算");
        say(a>>3);
        say(a>>35);
        say(0b01010101>>3);
        say(Integer.toBinaryString(a>>3));
        say(Integer.toBinaryString(a>>35));
        say(Integer.toBinaryString(-0b01010101>>3));
        say(null);

        say("进行特殊右移运算运算");
        say(a>>>3);
        say(a>>>35);
        say(0b01010101>>>3);
        say(Integer.toBinaryString(a>>>3));
        say(Integer.toBinaryString(a>>>35));
        say(Integer.toBinaryString(-0b01010101>>>3));
        say(null);

        say("进行左移运算运算");
        say(a<<3);
        say(a<<35);
        say(Integer.toBinaryString(a<<3));
        say(Integer.toBinaryString(a<<35));
        say(null);
    }

    public static void say(Object o){
        if(o==null){
            System.out.println();
        }else{
            System.out.println(o);
        }
    }

}
