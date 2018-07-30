package czy.demo.array;


import com.sun.istack.internal.Nullable;

import java.util.Arrays;

/**
 * Arrays为数组操作的工具类
 */
public class ArraysTest {

    public static void main(String[] args){

        int[] arr = {1212,32,56,6,2,889,434,88,121};
        int[] arr1 = {1212,32,56,6,2,889,434,88,121};
        int[] arr2 = {1212,32,56,6,2,889,434,88,122};

        say("数组转换为字符串为："+Arrays.toString(arr));
        say("二维数组浅转换："+Arrays.toString(new int[][]{arr}));
        say("二维数组深转换："+Arrays.deepToString(new int[][]{arr}));
        say(null);

        say("进行二分搜索，查找32："+Arrays.binarySearch(arr,32));
        say("进行二分搜索，查找23："+Arrays.binarySearch(arr,23));
        say(null);

        say("内容是否相等："+Arrays.equals(arr,arr1));
        say("内容是否相等："+Arrays.equals(arr,arr2));
        say(null);

        say("哈希码为："+Arrays.hashCode(arr));
        say("哈希码为："+Arrays.hashCode(arr1));
        say("哈希码为："+Arrays.hashCode(arr2));
        say(null);

        /**
         * 转换为列表，采用ArrayList类型
         */
        say("转换为列表为："+Arrays.asList(arr).getClass().getName());
        say(null);

        /**
         * 变长复制会使用0填充int值
         * 截断复制会直接截断
         */
        say("复制为长度为5的数组："+Arrays.toString(Arrays.copyOf(arr,5)));
        say("复制为长度为15的数组："+Arrays.toString(Arrays.copyOf(arr,15)));
        say(null);

        /**
         * 复制指定下标范围内的值，包含开始下标，不包含结束下标
         */
        say("复制0-5范围内的值："+Arrays.toString(Arrays.copyOfRange(arr,0,5)));
        say("复制4-7范围内的值："+Arrays.toString(Arrays.copyOfRange(arr,4,7)));

        /* 类似于遍历器 */
        say(""+Arrays.spliterator(arr));

        /**
         * 流式操作，首先转换为IntStream，再由IntStream转换为数组
         * IntStream可以进行函数式编程
         * 比较遗憾，目前操作函数还不支持下标参数与数组参数，与js有区别
         */
        say("大于100："+Arrays.toString(Arrays.stream(arr).filter(a->a>100).toArray()));
        say("乘以2之后："+Arrays.toString(Arrays.stream(arr).map(a->a*2).toArray()));
        say("由小到大排序："+Arrays.toString(Arrays.stream(arr).sorted().toArray()));
        say("去除重复元素："+Arrays.toString(Arrays.stream(new int[]{1,2,1,4,5,6,8,4}).distinct().toArray()));
        say("限制大小为5："+Arrays.toString(Arrays.stream(arr).limit(5).toArray()));
        say("对每个元素遍历执行操作：");
        Arrays.stream(arr).forEach(a->{
            System.out.println("我是遍历操作："+a);
        });

    }

    public static void say(Object o){
        if(o==null){
            System.out.println();
        }else{
            System.out.println(o);
        }
    }

}
