package czy.demo.util.structure.string;

import java.util.Arrays;

/* 字符串分割操作 */
public class SplitTest {

    public static void main(String[] args){

        /* 最简单的使用指定字符串分割，分割字符本身不会出现 */
        System.out.println(Arrays.toString("1,2,3,4,5,6,".split(",")));
        /* 也可以使用正则来分割，正则可以匹配一系列字符串 */
        System.out.println(Arrays.toString("1,2.3,4,5.6'7,0".split(",|\\.")));
        /* 可以使用第二个参数限制分割后的数组长度，如果本来的数组长度大于限制长度，则多余元素会合并为最后一个元素 */
        System.out.println(Arrays.toString("1,2,3,4,5,6,".split(",",3)));

    }


}
