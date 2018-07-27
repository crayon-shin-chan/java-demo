package czy.demo.string;

import java.util.Arrays;

public class StringOperationTest {

    /**
     * 1.在java语言中，汉字也是作为字符处理的，但是一般一个汉字对应两个编码但愿
     */
    public static void main(String[] args)throws Exception{
        String str1 = "abcdefgh";

        /* 引用判断操作 */
        System.out.println(str1=="abcdefgh");
        System.out.println(str1==new String("abcdefgh"));

        /* 长度操作，这里长度是unicode码点的数量，而不是编码单元 */
        System.out.println(str1.length());
        System.out.println("我是大侦探".length());

        /* 比较操作，大于为正数，小于为负数 */
        System.out.println(str1.compareTo("b"));
        System.out.println(str1.compareTo("a"));
        System.out.println(str1.compareTo("aa"));

        /* 对象相等，判断内容是否相等 */
        System.out.println(str1.equals("abcdefgh"));
        System.out.println(str1.equals("abc"));

        /* 哈希码 */
        System.out.println(str1.hashCode());

        /* 字节转换，字符串转字节数组，字节数组转字符串需要注意编码 */
        System.out.println(Arrays.toString(str1.getBytes()));
        System.out.println(new String("我是大侦探".getBytes("GBK"),"GBK"));
        System.out.println(new String("我是大侦探".getBytes("UTF-8"),"GBK"));
        System.out.println(new String("我是大侦探".getBytes("GBK"),"UTF-8"));

        /* 包含操作 */
        System.out.println(str1.contains("abc"));
        System.out.println(str1.contains("123"));

        /* 字符操作，汉字也是按照下标获取 */
        System.out.println(str1.charAt(1));
        System.out.println("我是大侦探".charAt(1));

        /* 码点操作，直接获取字符unicode码点，编码单元获取不到 */
        System.out.println((int)'a');
        System.out.println((int)'是');
        System.out.println(str1.codePointAt(1));
        System.out.println("我是大侦探".codePointAt(1));

        /* 连接操作 */
        System.out.println(str1.concat("123"));
        System.out.println("123".concat(str1));

        /* 下标操作 */
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.indexOf("bc"));
        System.out.println(str1.indexOf("n"));
        System.out.println("我是大侦探".indexOf("我"));
        System.out.println("我是大侦探".indexOf("哦"));
        System.out.println("abcdedcba".indexOf("a"));
        System.out.println("abcdedcba".lastIndexOf("a"));

        /* 开头、结尾判断 */
        System.out.println(str1.startsWith("abc"));
        System.out.println(str1.startsWith("def"));
        System.out.println(str1.endsWith("fgh"));
        System.out.println(str1.endsWith("abc"));

        /* 将堆中字符串对象转换为常量池对象 */
        System.out.println(new String("abc")=="abc");
        System.out.println(new String("abc").intern()=="abc");
    }

}
