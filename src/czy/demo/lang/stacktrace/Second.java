package czy.demo.lang.stacktrace;

public class Second {

    public static void doSecond()throws ClassNotFoundException{
        Third.doThird();
    }
}
