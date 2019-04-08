package czy.demo.structure.list;

import java.util.ArrayList;
import java.util.List;

/* 列表的简单测试 */
public class SimpleTest {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("565");
        list.add("1");
        list.add("23");

        /* 列表元素按照添加顺序排序 */
        System.out.println(list);

        list.add("565");
        list.add("23");
        list.add("1");
        /* 列表元素不会进行重复判断，不会覆盖，添加多少就是多少 */
        System.out.println(list);

        /* 移除的时候估计是使用equals方法，移除的第一个匹配的元素 */
        list.remove("1");
        System.out.println(list);

    }

}
