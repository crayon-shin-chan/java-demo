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
         * h >>> 16 ，为无符号又移，0补最高位
         * 如果h本身小于16位二进制数，则右移之后，^不会影响h的值
         * 如果h本身大于16位二进制数，则多出来的位数，
         * 这个计算方法还是不理解
         */
        return (h ^ (h >>> 16)) & HASH_BITS;
    }

}
