package czy.demo.sun.misc;

import sun.misc.Signal;
import sun.misc.SignalHandler;

import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

/**
 * SEGV, ILL, FPE, ABRT, INT, TERM, BREAK
 */
public class SignalTest {

    public static void main(String[] args)throws Exception {
        Signal signal = new Signal("INT");
        Signal.handle(signal, new SignalHandler() {
            @Override
            public void handle(Signal signal) {
                print(signal);
            }
        });
        Signal.raise(signal);
        System.out.println(ManagementFactory.getRuntimeMXBean().getName());
        TimeUnit.DAYS.sleep(1L);
    }

    private static void print(Signal signal){
        System.out.println("信号量名称为："+signal.getName());
        System.out.println("信号量数字为："+signal.getNumber());
        System.out.println("信号量类为："+signal.getClass().getName());
    }

}
