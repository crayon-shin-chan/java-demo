package czy.demo.lang.management;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;

public class GarbageCollectorMXBeanTest {

    public static void main(String[] args) {

        List<GarbageCollectorMXBean> garbageCollectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();

        for(GarbageCollectorMXBean garbageCollectorMXBean:garbageCollectorMXBeans){
            say("");
            say("=============");
            say("垃圾收集器名称："+garbageCollectorMXBean.getName());
            say("收集数量："+garbageCollectorMXBean.getCollectionCount());
            say("收集时间："+garbageCollectorMXBean.getCollectionTime());
            say("内存池名称："+ Arrays.toString(garbageCollectorMXBean.getMemoryPoolNames()));
        }

    }

    private static void say(Object o){
        System.out.println(o);
    }

}
