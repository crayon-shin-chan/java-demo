package czy.demo.lang.thread.concurrent.print;

public class PrintThread extends Thread {

    private String message;

    public PrintThread(String message){
        super();
        this.message = message;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            System.out.println(message);
        }
    }
}
