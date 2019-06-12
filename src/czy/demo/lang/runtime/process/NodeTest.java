package czy.demo.lang.runtime.process;

public class NodeTest {

    public static void main(String[] args)throws Exception{
        Process process = Runtime.getRuntime().exec("node -help");
        ProcessPrint.print(process);
    }

}
