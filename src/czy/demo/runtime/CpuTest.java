package czy.demo.runtime;

public class CpuTest {

    public static void main(String[] args){

        /* 获取当前可用的cpu数量 */
        System.out.println("当前可用的cpu数量为："+Runtime.getRuntime().availableProcessors());
    }
}
