package czy.demo.lang.runtime.process;

public class IPConfigTest {

    public static void main(String[] args)throws Exception{
        Process process = Runtime.getRuntime().exec("ipconfig");
        ProcessPrint.print(process);
    }

}
