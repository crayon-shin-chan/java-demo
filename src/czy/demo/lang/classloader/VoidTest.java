package czy.demo.lang.classloader;

public class VoidTest {

    public static void main(String[] args){
        say(Void.class);
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
