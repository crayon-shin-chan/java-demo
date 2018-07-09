package czy.demo.reflect.modifier;

import java.lang.reflect.Modifier;

/* Modifier测试类 */
public interface Test {

    public static void main(String[] args)throws NoSuchMethodException{

        int test = Test.class.getModifiers();
        /* 接口标识符的字符串为 abstract interface，而类本身并不会返回class */
        println("整数代表的标识符为："+Modifier.toString(test));
        println("类标识符不可能是static："+Modifier.isStatic(test));
        println("类标识符是否为public："+Modifier.isPublic(test));
        println("类标识符是否为private："+Modifier.isPrivate(test));
        println("类标识符是否为protected："+Modifier.isProtected(test));
        println("类标识符是否为final："+Modifier.isFinal(test));
        println("类标识符是否为抽象："+Modifier.isAbstract(test));
        println("类标识符是否为接口："+Modifier.isInterface(test));
        println("");
        int method = Test.class.getMethod("main",String[].class).getModifiers();
        println("整数代表的标识符为："+Modifier.toString(method));
        println("方法标识符是否为static：："+Modifier.isStatic(method));
        println("方法标识符是否为public："+Modifier.isPublic(method));
        println("方法标识符是否为private："+Modifier.isPrivate(method));
        println("方法标识符是否为protected："+Modifier.isProtected(method));
        println("方法标识符是否为final："+Modifier.isFinal(method));
        println("方法标识符是否为抽象："+Modifier.isAbstract(method));
        println("方法标识符是否为接口："+Modifier.isInterface(method));
        println("");
    }

    static void println(String s){
        System.out.println(s);
    }

}
