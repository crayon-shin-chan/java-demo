package czy.demo.structure.set;

import java.util.HashSet;
import java.util.Set;

/* 集合的简单演示 */
public class SimpleTest {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        /* 虽然set内元素是无序的，那是指没有字典序，其实内部是按照哈希排序的 */
        System.out.println(set);

        /* 重复元素会发生覆盖 */
        set.add("张三");
        System.out.println(set);
    }

}
