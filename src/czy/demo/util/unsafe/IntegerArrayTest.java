package czy.demo.util.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/* integer数组测试，由于为对象数组，则数组指定位置存储的为指针，而不是数值 */
public class IntegerArrayTest {

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

        Integer[] arr = new Integer[]{12,23,45,56,67,78,100};
        System.out.println("数组类基本偏移为："+U.arrayBaseOffset(arr.getClass()));
        System.out.println("数组类下标精度为："+U.arrayIndexScale(arr.getClass()));
        printArray(arr);
    }

    private static void printArray(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            long offset = U.arrayBaseOffset(arr.getClass()) + i*U.arrayIndexScale(arr.getClass());
            /* 这里的getObject方法就是获取指定对象的指定偏移处引用对象的方法
             * 这里首先获取指定偏移处地址，然后根据地址获取对象
             */
            System.out.println("偏移"+offset+"处的值为："+U.getObject(arr,offset));
        }
    }

}



