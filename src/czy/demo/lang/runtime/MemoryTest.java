package czy.demo.lang.runtime;

public class MemoryTest {


    public static void main(String[] args){

        /* 当前java虚拟机可用的闲置内存，以字节为单位 */
        say("当前可用内存为："+Runtime.getRuntime().freeMemory());

        /* 获取java虚拟机已经从操作系统获取的内存大小 */
        say("当前总内存为："+Runtime.getRuntime().totalMemory());

        /* 获取java虚拟机能够从操作系统获取的最大内存 */
        say("当前最大内存为："+Runtime.getRuntime().maxMemory());

    }

    public static void say(String s){
        System.out.println(s);
    }
}
