package czy.demo.lang.classloader;

/* 主线程类加载器 */
public class MainThreadClassLoaderTest {

    public static void main(String[] args){
        /* 主线程上下文类加载器在sun.misc.Launcher中设置 */
        System.out.println(Thread.currentThread().getContextClassLoader());
    }

}
