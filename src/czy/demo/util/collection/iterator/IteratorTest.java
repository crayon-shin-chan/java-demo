package czy.demo.util.collection.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorTest {

    public static void main(String[] args){
        Iterable<String> iterable = Arrays.asList("apple","banana","orange");
        Iterator<String> iterator = iterable.iterator();
        /* while循环已被替换为foreack方法 */
        while(iterator.hasNext()){
            System.out.println("下一个元素为："+iterator.next());
        }
        System.out.println("还有没有下一个元素："+iterator.hasNext());
        try{
            iterator.next();
        }catch (NoSuchElementException ex){
            System.out.println("抛出了异常NoSuchElementException");
            ex.getStackTrace();
        }
        /* 迭代过后原始集合不变 */
        System.out.println("迭代过后为："+iterable.toString());
    }
}
