package czy.demo.thread.concurrent.gate;

public class UserThread extends Thread{

    private Gate gate;
    private String myname;
    private String myaddress;

    public UserThread(Gate gate,String myname,String myaddress){
        this.gate = gate;
        this.myname = myname;
        this.myaddress = myaddress;
    }

    /* 此用户不断的循环通过大门 */
    @Override
    public void run() {
        System.out.println(myname + " BEGIN");
        while(true){
            gate.pass(myname,myaddress);
        }
    }
}
