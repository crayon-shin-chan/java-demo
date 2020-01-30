package czy.demo.lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryManagerMXBean;
import java.util.Arrays;
import java.util.List;

public class MemoryManagerMXBeanTest {

    public static void main(String[] args) {

        List<MemoryManagerMXBean> memoryManagerMXBeans = ManagementFactory.getMemoryManagerMXBeans();

        for (MemoryManagerMXBean memoryManagerMXBean:memoryManagerMXBeans){
            say("");
            say("=============");
            say("内存管理名称："+memoryManagerMXBean.getName());
            say("内存池名称："+ Arrays.toString(memoryManagerMXBean.getMemoryPoolNames()));
            say("是否有效："+memoryManagerMXBean.isValid());
        }

    }

    private static void say(Object o){
        System.out.println(o);
    }

}
