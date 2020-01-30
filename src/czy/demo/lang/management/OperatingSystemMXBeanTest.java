package czy.demo.lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class OperatingSystemMXBeanTest {

    public static void main(String[] args) {

        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        say("操作系统名称："+operatingSystemMXBean.getName());
        say("操作系统架构："+operatingSystemMXBean.getArch());
        say("操作系统版本："+operatingSystemMXBean.getVersion());
        say("可用进程数量："+operatingSystemMXBean.getAvailableProcessors());
        say("系统平均负载："+operatingSystemMXBean.getSystemLoadAverage());


    }

    private static void say(Object o){
        System.out.println(o);
    }



}
