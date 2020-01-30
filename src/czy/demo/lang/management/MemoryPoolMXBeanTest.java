package czy.demo.lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.Arrays;
import java.util.List;

public class MemoryPoolMXBeanTest {

    public static void main(String[] args) {

        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();

        for(MemoryPoolMXBean memoryPoolMXBean:memoryPoolMXBeans){

            say("");
            say("==================");
            say("内存池名称："+memoryPoolMXBean.getName());
            //say("内存使用："+memoryPoolMXBean.getCollectionUsage());
            //say("内存使用阈值："+memoryPoolMXBean.getCollectionUsageThreshold());
            //say("内存使用阈值数量："+memoryPoolMXBean.getCollectionUsageThresholdCount());
            say("内存管理名称："+ Arrays.toString(memoryPoolMXBean.getMemoryManagerNames()));
            say("峰值使用："+memoryPoolMXBean.getPeakUsage());
            say("内存类型："+memoryPoolMXBean.getType());
            say("内存使用："+memoryPoolMXBean.getUsage());;

        }


    }

    private static void say(Object o){
        System.out.println(o);
    }


}
