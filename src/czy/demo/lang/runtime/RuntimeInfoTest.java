package czy.demo.lang.runtime;

/* 通过Runtime打印运行时信息 */
public class RuntimeInfoTest {

    public static void main(String[] args){

        Runtime runtime = Runtime.getRuntime();

        print(runtime);

    }

    public static void print(Runtime runtime){
        say("cpu线程数量为："+runtime.availableProcessors());
        say("JVM总内存为："+runtime.totalMemory());
        say("JVM空闲内存为："+runtime.freeMemory());
        say("JVM最大内存为："+runtime.maxMemory());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
