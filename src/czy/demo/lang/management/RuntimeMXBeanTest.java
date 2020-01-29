package czy.demo.lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class RuntimeMXBeanTest {

    public static void main(String[] args) {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        say("名称："+runtimeMXBean.getName());
        say("是否支持引导类加载器："+runtimeMXBean.isBootClassPathSupported());
        say("引导类路径："+runtimeMXBean.getBootClassPath());
        say("类路径："+runtimeMXBean.getClassPath());
        say("库路径："+runtimeMXBean.getLibraryPath());
        say("管理指定版本："+runtimeMXBean.getManagementSpecVersion());
        say("指定名称："+runtimeMXBean.getSpecName());
        say("指定供应商："+runtimeMXBean.getSpecVendor());
        say("指定版本："+runtimeMXBean.getSpecVersion());
        say("JVM名称："+runtimeMXBean.getVmName());
        say("JVM供应商："+runtimeMXBean.getVmVendor());
        say("JVM版本："+runtimeMXBean.getVmVersion());
        say("虚拟机输入参数："+runtimeMXBean.getInputArguments());
        say("虚拟机运行时间："+runtimeMXBean.getUptime());
        say("虚拟机启动时间："+runtimeMXBean.getStartTime());
        say("系统属性："+runtimeMXBean.getSystemProperties());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
