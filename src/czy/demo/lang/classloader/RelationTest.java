package czy.demo.lang.classloader;


/**
 * 类加载器关系测试
 * AppClassLoader、ExtClassLoader都是sun.misc.Launcher里定义的内部类
 */
public class RelationTest {

    public static void main(String[] args){
        ClassLoader current = Thread.currentThread().getContextClassLoader();
        ClassLoader ext = current.getParent();
        ClassLoader boot = ext.getParent();

        /* sun.misc.Launcher$AppClassLoader@18b4aac2 */
        System.out.println("当前主类的加载器为："+current);

        /* sun.misc.Launcher$ExtClassLoader@4554617c */
        System.out.println("父类加载器为："+ext);
        System.out.println("引导类加载器为："+boot);
    }

}
