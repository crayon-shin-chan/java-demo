package czy.demo.util.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/* long数组测试 */
public class LongArrayTest {


    private static Unsafe U;

    static {
        /* 只有引导类加载器和扩展类加载器加载的系统类才能使用Unsafe.getUnsafe获取Unsafe对象 */
        try {
            Field f= Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            U = (Unsafe) f.get(null);
        }catch (Exception ex){

        }
    }

    public static void main(String[] args){

        long[] arr = new long[]{12,54,23,7,89};
        /* 数组类型都有一个基本偏移，表示最开始的元素存储于基本偏移字节处，基本都是16 */
        System.out.println("long数组基本偏移为："+U.arrayBaseOffset(arr.getClass()));
        /* 下标精度代表了每个元素间隔的字节数量，为元素的存储字节数 */
        System.out.println("数组类下标精度为："+U.arrayIndexScale(arr.getClass()));
        printArray(arr);
        /* 获取并且设置指定字节偏移处元素 */
        U.getAndSetLong(arr,16L,1000L);
        printArray(arr);
    }

    /*
     * 打印出数组元素
     */
    private static void printArray(long[] arr){
        /* 第一个元素的偏移为16字节，为int数组的基本偏移，每隔四个字节为一个int */
        for(int i=0;i<arr.length;i++){
            long offset = U.arrayBaseOffset(arr.getClass()) + i*U.arrayIndexScale(arr.getClass());
            System.out.println("数组偏移"+offset+"处为："+U.getLong(arr,offset));
        }
    }

}
