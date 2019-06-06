package czy.demo.lang.system;

import java.util.Date;

/* 系统时间示例 */
public class SystemTimeTest {

    public static void main(String[] args){
        /* 可以获取真实时间 */
        say("系统当前毫秒时间戳为："+System.currentTimeMillis());
        say("当前时间为：        "+new Date(System.currentTimeMillis()).toLocaleString());

        /* 无法获得真实时间，只能获取相对于某未知时间点的相对时间，可以保证每次调用相对时间点不变 */
        say("系统当前纳秒时间戳为："+System.nanoTime());
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
