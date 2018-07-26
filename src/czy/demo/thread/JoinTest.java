package czy.demo.thread;

public class JoinTest {

    private static int length = 100;

    /* 在线程1中调用线程2的join方法，可以保证线程2运行结束之后，线程1才会继续运行下去 */
    public static void main(String[] args)throws Exception{
        Thread[] threads = new Thread[length];
        for(int i=0;i<length;i++){
            final int x = i;
            threads[i] = new Thread(()->{
                try{
                    System.out.println("运行第"+(x+1)+"个线程");
                    if(x<length-1){
                        threads[x+1].join();
                        System.out.println("第"+(x+2)+"个线程运行完毕");
                    }else{
                        System.out.println("到达终点");
                    }
                }catch(Exception ex){}
            });
        }
        for(int i=0;i<length;i++){
            threads[i].start();
        }
        threads[0].join();
        System.out.println("第1个线程运行完毕");
    }

}
