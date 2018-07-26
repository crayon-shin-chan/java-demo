package czy.demo.thread;

public class PriorityTest {

    private static int length = 10;

    /**
     * 这个依靠计数代表cpu时间片的线程优先级测试，不是很合适
     */
    public static void main(String[] args)throws Exception{
        long[] sums = new long[length];
        Thread[] threads = new Thread[length];
        for(int i=0;i<length;i++){
            sums[i] = 0;
            final int x = i+1;
            Thread thread = new Thread(()->{
                while(true){
                    sums[x-1]++;
                }
            });
            thread.setPriority(x);
            threads[i] = thread;
        }
        for(int i=0;i<length;i++){
            threads[i].start();
        }
        Thread.sleep(3000);
        for(int i=0;i<length;i++){
            threads[i].stop();
        }
        System.out.println("运行结束，结果为：");
        for(long i:sums){
            System.out.println(i);
        }
    }

}
