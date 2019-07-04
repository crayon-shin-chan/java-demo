package czy.demo.lang.classloader;

/* 数组类型的类加载器是其元素类型的类加载器 */
public class ArrayTest {

    public static void main(String[] args){
        /* 引导类加载器null */
        say(String[].class.getClassLoader());
        /* 应用类加载器sun.misc.Launcher$AppClassLoader@18b4aac2 */
        say(ArrayTest[].class.getClassLoader());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
