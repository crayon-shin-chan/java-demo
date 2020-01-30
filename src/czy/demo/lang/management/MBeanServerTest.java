package czy.demo.lang.management;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.util.Arrays;

public class MBeanServerTest {

    public static void main(String[] args) {

        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        say("默认域："+mBeanServer.getDefaultDomain());
        say("所有域："+ Arrays.toString(mBeanServer.getDomains()));
        say("MBean数量："+mBeanServer.getMBeanCount());

    }

    private static void say(Object o){
        System.out.println(o);
    }

}
