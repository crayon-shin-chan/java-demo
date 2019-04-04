package czy.demo.util.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/* unsafe是直接对内存操作的类，性能好，危险性大 */
public class ArrayTest {


    private static Unsafe U;

    static {
        try {
            Field f= Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            U = (Unsafe) f.get(null);
        }catch (Exception ex){

        }
    }

    public static void main(String[] args)throws Exception{
        int[] arr = new int[]{12,54,23,7,89};
        printArray(arr);
        /* 获取并且设置指定字节偏移处元素 */
        U.getAndSetInt(arr,16L,1000);
        printArray(arr);
    }

    /*
     * 打印出数组元素
     */
    private static void printArray(int[] arr){
        /* 第一个元素的偏移为16字节，为int数组的基本偏移，每隔四个字节为一个int */
        for(int i=16;i<36;i+=4){
            System.out.println("数组偏移"+i+"处为："+U.getInt(arr,(long)i));
        }
    }


}
