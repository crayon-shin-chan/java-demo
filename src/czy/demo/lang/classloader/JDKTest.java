package czy.demo.lang.classloader;

import java.io.File;
import java.net.Socket;

/* JDK类的类加载器是引导类加载器，都是Null */
public class JDKTest {

    public static void main(String[] args){
        say(String.class.getClassLoader());
        say(System.class.getClassLoader());
        say(File.class.getClassLoader());
        say(Socket.class.getClassLoader());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
