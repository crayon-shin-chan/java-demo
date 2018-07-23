package czy.demo.reflect.stacktrace;


public class First {

    public static void doFirst()throws ClassNotFoundException{
        Second.doSecond();
    }

}
