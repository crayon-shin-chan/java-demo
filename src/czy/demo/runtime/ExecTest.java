package czy.demo.runtime;

import java.io.InputStream;

public class ExecTest {


    public static void main(String[] args)throws Exception{

        /* java的运行时执行命令获取一个Process对象，通过Process可以获取输入、输出流 */
        Process process = Runtime.getRuntime().exec("git --help");

        /* 刚刚获取时，进程为活动状态 */
        say("进程是否在活动："+process.isAlive());

        InputStream in = process.getInputStream();
        byte[] buffer = new byte[1048];
        int length;
        while((length = in.read(buffer,0,buffer.length))!=-1){
            say(new String(buffer));
        }

        /* 执行完毕后，进程为非活动状态，退出码为0 */
        say("进程是否在活动："+process.isAlive());
        say("进程退出码为："+process.exitValue());
    }

    public static void say(String s){
        System.out.println(s);

    }
}
