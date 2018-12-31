package czy.demo.thread.status;


public class SleepTest {

    private static final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            for(int i=0;i<100;i++){
                System.out.println("正在执行！");
                /* 线程沉睡，可能抛出Interrupt异常 */
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    System.err.println("发生了异常");
                }
            }
        }
    };

    public static void main(String[] args){
       new Thread(runnable).start();
    }

}
