package czy.demo.lang.management;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

public class ThreadMXBeanTest {

    public static void main(String[] args) {

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] ids = threadMXBean.getAllThreadIds();
        say("当前所有线程ID："+ Arrays.toString(ids));
        say("当前所有Deadlocked线程ID："+Arrays.toString(threadMXBean.findDeadlockedThreads()));
        say("当前所有MonitorDeadlocked线程ID："+Arrays.toString(threadMXBean.findMonitorDeadlockedThreads()));
        say("当前线程的总CPU时间，单位纳秒："+threadMXBean.getCurrentThreadCpuTime());
        say("当前线程的总用户态时间，单位纳秒："+threadMXBean.getCurrentThreadUserTime());
        say("守护线程数量："+threadMXBean.getDaemonThreadCount());
        say("Peak线程数量："+threadMXBean.getPeakThreadCount());
        say("线程数量："+threadMXBean.getThreadCount());
        say("一个启动线程数量："+threadMXBean.getTotalStartedThreadCount());
        say("当前线程是否支持CPU时间："+threadMXBean.isCurrentThreadCpuTimeSupported());

        for(ThreadInfo info: threadMXBean.getThreadInfo(ids)){
            say("===================");
            say("当前线程ID："+info.getThreadId());
            say("当前线程锁名称："+info.getLockName());
            say("当前线程锁拥有者名称"+info.getLockOwnerName());
            say("当前线程名称："+info.getThreadName());
            say("阻塞数量："+info.getBlockedCount());
            say("阻塞时间："+info.getBlockedTime());
            say("线程状态："+info.getThreadState());
            say("等待数量："+info.getWaitedCount());
            say("等待时间："+info.getWaitedTime());
            say("是否挂起："+info.isSuspended());
            say("是否原生："+info.isInNative());
            say("当前线程堆栈："+Arrays.toString(info.getStackTrace()));
        }

    }

    private static void say(Object o){
        System.out.println(o);
    }

}
