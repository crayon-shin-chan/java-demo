package czy.demo.thread.concurrent.gate;

public class Main {

    /* Gate.pass方法非线程安全时，不断出错 */
    public static void main(String[] args){
        Gate gate = new Gate();
        new UserThread(gate,"Alice","Alasja").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();
    }

}
