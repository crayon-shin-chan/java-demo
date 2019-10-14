package czy.demo.lang.iclass;

public class SingletonTest {

    /** Class对象是全局单例的 */
    public static void main(String[] args)throws Exception{
            System.out.println(String.class == Class.forName("java.lang.String"));
            System.out.println(String.class == String.class);
    }

}
