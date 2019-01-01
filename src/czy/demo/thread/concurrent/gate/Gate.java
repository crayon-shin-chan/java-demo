package czy.demo.thread.concurrent.gate;

/* 大门类，一次只允许一个人通过，非线程安全 */
public class Gate {

    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    /**
     * 每次通过一个人
     * @param name：人名
     * @param address：地址
     */
    public void pass(String name,String address){
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    /**
     * 检查人名地址是否相符
     */
    private void check(){
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("***** ERROR *****"+toString());
        }
    }

    @Override
    public String toString() {
        return "Gate{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
