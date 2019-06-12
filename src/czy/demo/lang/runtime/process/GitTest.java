package czy.demo.lang.runtime.process;

public class GitTest {

    public static void main(String[] args)throws Exception{
        Process process = Runtime.getRuntime().exec("git --help");
        ProcessPrint.print(process);
        ProcessPrint.print(new ProcessBuilder().command("git","--help").start());
    }
}
