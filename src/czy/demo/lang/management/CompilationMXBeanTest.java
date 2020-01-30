package czy.demo.lang.management;

import java.lang.management.CompilationMXBean;
import java.lang.management.ManagementFactory;

public class CompilationMXBeanTest {

    public static void main(String[] args) {

        CompilationMXBean compilationMXBean = ManagementFactory.getCompilationMXBean();
        say("JIT编译器名称："+compilationMXBean.getName());
        say("总编译时间："+compilationMXBean.getTotalCompilationTime());
        say("是否支持编译时间监控："+compilationMXBean.isCompilationTimeMonitoringSupported());;
    }

    private static void say(Object o){
        System.out.println(o);
    }


}
