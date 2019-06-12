package czy.demo.lang.runtime.process;

import java.io.*;

/* 线程输出打印 */
public class ProcessPrint {

    public static void print(Process process)throws Exception{
        boolean active = process.isAlive();
        say("进程是否活动："+active);
        if(active){
            InputStream in = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(in)));
            String line = null;
            while ((line = reader.readLine())!=null){
                say(line);
            }
            say("进程是否活动："+process.isAlive());
        }

    }

    private static void say(Object o){
        System.out.println(o);
    }

}
