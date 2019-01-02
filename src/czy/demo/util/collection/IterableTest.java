package czy.demo.util.collection;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Iterable接口定义有forEach方法，接受函数式接口Consumer对象
 * 对每个元素进行处理
 */
public class IterableTest {

    public static void main(String[] args){
        Iterable<String> iterable = Arrays.asList("apple","banana","orange");
        iterable.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if(s.contains("b")){
                    System.out.println("字符串为："+s);
                }
            }
        });
    }

}
