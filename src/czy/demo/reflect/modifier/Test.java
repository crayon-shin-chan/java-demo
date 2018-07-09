package czy.demo.reflect.modifier;

import java.lang.reflect.Modifier;

/* Modifier测试类 */
public interface Test {





    public static void main(String[] args){

        int test = Test.class.getModifiers();
        /* 接口标识符的字符串为 abstract interface，而类本身并不会返回class */
        System.out.println("整数代表的标识符为："+Modifier.toString(test));
        System.out.println("类标识符是否为public："+Modifier.isPublic(test));
        System.out.println("类标识符是否为private："+Modifier.isPrivate(test));
        System.out.println("类标识符是否为protected："+Modifier.isProtected(test));
        System.out.println("类标识符是否为final："+Modifier.isFinal(test));
        System.out.println("类标识符是否为抽象："+Modifier.isAbstract(test));
        System.out.println("类标识符是否为接口："+Modifier.isInterface(test));
    }

}
