package czy.demo.array;

import java.util.Arrays;

/**
 * 数组有多种初始化方式
 */
public class InitializationTest {

    public static void main(String[] args){

        /**
         * 直接构造的数组对象，其中每个元素会采用默认值进行填充
         * 这种情况下，构造数组对象必须指定长度
         */
        int[] arr1 = new int[10];
        System.out.println(Arrays.toString(arr1));

        /**
         * 这样构造的数组对象，元素直接初始化
         * 不需要指定数组长度，长度与初始化时的元素个数相同
         * 这个方式可以作为匿名数组对象使用，也就是不想声明变量
         * 只需要一个数组对象时可以使用
         */
        int[] arr2 = new int[]{1,2,3,4,5,6,7,8,9};

        /**
         * 这种方式与上面大概相同，唯一区别是不可以当做匿名数组对象使用
         * 也就是当需要一个数组对象作为参数时，不可以使用这种方式
         * 可以使用上面的方式
         */
        int[] arr3 = {1,2,3,4,5,6,7,8,9};
    }

}
