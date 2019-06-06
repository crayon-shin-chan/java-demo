package czy.demo.lang.system;

import java.util.Arrays;

/* System类提供了数组拷贝方法，此方法可以对所有类型数组使用
 * 而且通过JNI调用，效率比较高
 */
public class ArrayCopyTest {

    public static void main(String[] args){
        int[] src = {1,2,3,4,5,6,7,8,9,10};
        int[] tar = new int[20];

        System.arraycopy(src,0,tar,10,10);
        say(Arrays.toString(tar));
        System.arraycopy(src,0,tar,0,10);
        say(Arrays.toString(tar));
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
