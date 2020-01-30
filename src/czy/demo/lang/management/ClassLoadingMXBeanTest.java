package czy.demo.lang.management;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;

public class ClassLoadingMXBeanTest {

    public static void main(String[] args) {

        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();

        say("已加载类数量："+classLoadingMXBean.getLoadedClassCount());
        say("总共加载的类数量："+classLoadingMXBean.getTotalLoadedClassCount());
        say("未加载的类数量："+classLoadingMXBean.getUnloadedClassCount());
        say("是否详细："+classLoadingMXBean.isVerbose());
        say("对象名称："+classLoadingMXBean.getObjectName().getCanonicalName());
        ;
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
