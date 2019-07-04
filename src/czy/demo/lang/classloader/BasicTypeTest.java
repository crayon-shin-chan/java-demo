package czy.demo.lang.classloader;

/* 基本类型有Class对象，但是没有类加载器 */
public class BasicTypeTest {

    public static void main(String[] args){

        /* 都是Null */
        say("基本类型的类加载器");
        say(byte.class.getClassLoader());
        say(short.class.getClassLoader());
        say(int.class.getClassLoader());
        say(long.class.getClassLoader());
        say(float.class.getClassLoader());
        say(double.class.getClassLoader());
        say(char.class.getClassLoader());
        say(boolean.class.getClassLoader());

        /* 包装类型的类加载器都是null，因为引导类加载器本来就是Null */
        say("包装类型的类加载器");
        say(Byte.class.getClassLoader());
        say(Short.class.getClassLoader());
        say(Integer.class.getClassLoader());
        say(Long.class.getClassLoader());
        say(Float.class.getClassLoader());
        say(Double.class.getClassLoader());
        say(Character.class.getClassLoader());
        say(Boolean.class.getClassLoader());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
