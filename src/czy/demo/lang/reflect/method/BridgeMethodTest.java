package czy.demo.lang.reflect.method;

import java.lang.reflect.Method;

public class BridgeMethodTest{

    /*
     * 查看结果发现生成了一个Bridge方法
     * public java.lang.Object czy.demo.lang.reflect.method.GenericImpl.get(java.lang.Object)
     * 桥接方法即在实现泛型接口时,由于泛型擦除.为了字节码兼容,在字节码级别生成了一个转换方法
     * 转换方法中的泛型类型全部为Object,在调用指定泛型类型方法时,内部调用了桥接方法
     * 桥接方法中进行了类型转换,即Object类型到String类型的转换,可能抛出转换异常
     */
    public static void main(String[] args){
        Method[] methods = GenericImpl.class.getMethods();
        say("方法数量为:"+methods.length);
        for(Method m:methods){
            say("获取方法名为:"+m.getName());
            say("获取方法内容为:"+m.toGenericString());
            say("方法是否为桥接方法:"+m.isBridge());
        }

    }

    public static void say(Object o){
        System.out.println(o);
    }

}
