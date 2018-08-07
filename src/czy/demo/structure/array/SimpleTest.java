package czy.demo.structure.array;

public class SimpleTest {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        say("数组长度为："+arr.length);

        /* 数组转换为字符串并不是实际内容 */
        say("数组转换为字符串为："+arr.toString());

        /* 克隆数组与原数组引用不同了 */
        say("克隆数组与原数组比较引用为；"+(arr==arr.clone()));
    }

    public static void say(Object o){
        System.out.println(o);
    }

}
