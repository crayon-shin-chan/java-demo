package czy.demo.thread;

public class SimpleTest {

    public static void main(String[] args){
        new Thread(()->{
            System.out.println("这是线程内部");
        }).start();
        /* 这句话首先输出，可见线程是异步执行的 */
        System.out.println("这是线程外部");
    }
}
