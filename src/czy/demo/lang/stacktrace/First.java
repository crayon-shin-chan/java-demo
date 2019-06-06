package czy.demo.lang.stacktrace;


public class First {

    public static void doFirst()throws ClassNotFoundException{
        Second.doSecond();
    }

}
