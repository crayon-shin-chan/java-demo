package czy.demo.thread;

public class ProformanceTest {

    public static void main(String[] args){

        int length = 1000;

        //putong(length);
        thread(length);

    }

    /* 执行简单操作，内存基本不变，时间短 */
    public static void putong(int length){
        long start = System.currentTimeMillis();
        for(int i=0;i<length;i++){
            System.out.println("当前执行的是弟"+(i+1)+"个操作");
            System.out.println("当前空闲内存为："+Runtime.getRuntime().freeMemory());
            System.out.println("当前执行时间为："+(System.currentTimeMillis()-start)+"毫秒");
        }
        long end = System.currentTimeMillis();
        System.out.println(length+"个普通操作执行时间为："+(end-start)+"毫秒");
    }

    /* 执行简单操作，内存变化大，时间长 */
    public static void thread(int length){
        long threadStart = System.currentTimeMillis();
        for(int i=0;i<length;i++){
            /* lamada表达式必须引用final变量 */
            final int a = i;
            new Thread(()->{
                System.out.println("当前执行的是弟"+(a+1)+"个线程");
                System.out.println("当前空闲内存为："+Runtime.getRuntime().freeMemory());
                System.out.println("当前线程执行时间为："+(System.currentTimeMillis()-threadStart)+"毫秒");
            }).start();
        }
    }

}
