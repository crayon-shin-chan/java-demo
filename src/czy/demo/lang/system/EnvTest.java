package czy.demo.lang.system;

import java.util.Map;

public class EnvTest {

    public static void main(String[] args){
        Map<String,String> env = System.getenv();
        for(Map.Entry<String,String> entry:env.entrySet()){
            say("key："+String.format("%-25s",entry.getKey())+"， value："+entry.getValue());
        }
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
