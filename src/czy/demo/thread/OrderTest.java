package czy.demo.thread;

public class OrderTest {

    public static void main(String[] args){

        /* 执行时虽然大致顺序是对的，但是具体顺序并不一定 */
        for(int i=0;i<100;i++){

            /* lamada表达式必须引用final变量 */
            final int a = i;
            new Thread(()->{
                System.out.println("当前执行的是弟"+(a+1)+"个线程");
            }).start();
        }
    }

}
