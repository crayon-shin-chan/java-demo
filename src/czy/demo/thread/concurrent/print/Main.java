package czy.demo.thread.concurrent.print;

public class Main {

    /**
     * 打印数量较少，为100左右时，顺序打印
     * 打印次数较多时，大段交叉打印，很多个张三，然后很多个李四
     * @param args
     */
    public static void main(String[] args){
        new PrintThread("张三").start();
        new PrintThread("李四").start();
    }

}
