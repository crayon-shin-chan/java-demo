package czy.demo.lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class MemoryMXBeanTest {

    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        say("堆内存使用："+memoryMXBean.getHeapMemoryUsage());
        say("非堆内存使用："+memoryMXBean.getNonHeapMemoryUsage());
        say("等待finaliza的对象数量："+memoryMXBean.getObjectPendingFinalizationCount());;
    }

    private static void say(Object o){
        System.out.println(o);
    }


}
