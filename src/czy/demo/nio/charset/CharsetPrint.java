package czy.demo.nio.charset;


import java.nio.charset.Charset;

public class CharsetPrint {

    public  static void print(Charset charset){
        say("实现类为："+charset.getClass().getName());
        say("字符集名称为："+charset.name());
        say("字符集显示名称为："+charset.displayName());
        say("字符集别名为："+charset.aliases());
        say("字符集是否可编码："+charset.canEncode());
        say("字符集是否已注册："+charset.isRegistered());

    }

    private static void say(Object o){
        System.out.println(o);
    }
}
