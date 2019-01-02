package czy.demo.util.collection.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Iterator接口的forEachRemaining方法，对当前迭代器的其余元素执行方法
 * 已经迭代过的元素不会被
 */
public class ForEachTest {

    public static void main(String[] args){
        Iterator<String> iterator = Arrays.asList("apple","banana","orange").iterator();
        System.out.println("获取第一个元素："+iterator.next());
        System.out.println("显示其余元素：");
        iterator.forEachRemaining(element->{
            System.out.println(element);
        });
    }

}
