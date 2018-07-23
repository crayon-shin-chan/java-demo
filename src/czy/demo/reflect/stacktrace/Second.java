package czy.demo.reflect.stacktrace;

public class Second {

    public static void doSecond()throws ClassNotFoundException{
        Third.doThird();
    }
}
