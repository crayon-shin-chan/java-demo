package czy.demo.util.collection.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* remove方法会移除next方法返回的最后一个元素
 * Arrays.asList方法返回的List为Arrays的内部类，不支持remove方法
 * ArrayList类则支持此方法
 */
public class RemoveTest {

    public static void main(String[] args){
        ArrayList<String> iterable = new ArrayList<>(Arrays.asList("apple","banana","orange"));
        Iterator<String> iterator = iterable.iterator();
        /* while循环已被替换为foreack方法 */
        while(iterator.hasNext()){
            System.out.println("下一个元素为："+iterator.next());
            iterator.remove();
            System.out.println("移除后集合为："+iterable.toString());
        }

    }


}
