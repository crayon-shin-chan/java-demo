package czy.demo.util.concurrent.hash.map;


import static java.lang.Math.log;

public class SpreadTest {

    /* 这应该只是个最大限制 */
    private static final int HASH_BITS = 0x7fffffff; // usable bits of normal node hash

    public static void main(String[] args){
        System.out.println("哈希字节为："+HASH_BITS);
        System.out.println("是2的"+log(HASH_BITS)/log(2)+"次幂");
        System.out.println("2的31次幂为："+Math.pow(2,31));
        System.out.println("2的16次幂为："+Math.pow(2,16));
        System.out.println(spread(14));
        System.out.println(spread(120));
        System.out.println(spread(755360000));
    }

    /**
     * 这个方法是ConCurrentMap用来计算哈希码的方法
     * @param h：键的哈希码
     * @return：计算出来的哈希码
     */
    private static int spread(int h){
        /**
         * key.hashCode()函数调用的是key键值类型自带的哈希函数，它返回一个32位int类型的散列值
         * 考虑到2进制32位带符号的int表值范围从-2147483648到2147483648，前后加起来大概40亿的映射空间。一个40亿长度的数组，内存是放不下的！
         * 散列值一般只会用到后面的位，但是如果只取到最后几位的话，碰撞会很严重。于是就有了“扰动函数”——右位移16位，正好是32bit的一半
         * 自己的高半区和低半区做异或，就是为了混合原始哈希码的高位和低位，以此来加大低位的随机性。而且混合后的低位掺杂了高位的部分特征，这样高位的信息也被变相保留下来
         * h >>> 16 ，为无符号又移，0补最高位
         * 返回值是一个低16位经过扰动处理的int类型，还是不会直接拿来用的。源码中每次使用键的hash值时都会通过一些方式
         */
        return (h ^ (h >>> 16)) & HASH_BITS;
    }

}
