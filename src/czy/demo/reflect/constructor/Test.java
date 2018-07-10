package czy.demo.reflect.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* 反射构造函数测试类 */
public class Test {

    public Test(){
        System.out.println("默认构造函数");
    }

    private Test(String name){
        System.out.println("单参数构造函数，参数为："+name);
    }

    public Test(String name,int age){
        System.out.println("双参数构造函数，参数为：name:"+name+", age:"+age);
    }

    public static void main(String[] args) throws Exception{
        Constructor[] constructors = Test.class.getConstructors();
        Constructor[] declare = Test.class.getDeclaredConstructors();

        println("类构造函数，不包括private构造函数，为：");

        for(Constructor c:constructors){
            println("构造函数名称为："+c.getName());
            println("构造函数标识符为："+Modifier.toString(c.getModifiers()));
            println("构造函数声明类型为："+c.getDeclaringClass().getName());
            println("构造函数异常类型为：");
            for(Class cc:c.getExceptionTypes()){
                println("    "+cc.getName());
            }
            println("构造函数参数数量为："+c.getParameterCount());
            println("构造函数参数类型为：");
            for(Class cc:c.getExceptionTypes()){
                println("    "+cc.getName());
            }
            println("");
        }

        println("声明构造函数为：");
        for(Constructor c:declare){
            println(" 构造函数名称为："+c.getName());
            println("构造函数标识符为："+Modifier.toString(c.getModifiers()));
            println("构造函数声明类型为："+c.getDeclaringClass().getName());
            println("构造函数异常类型为：");
            for(Class cc:c.getExceptionTypes()){
                println("    "+cc.getName());
            }
            println("构造函数参数数量为："+c.getParameterCount());
            println("构造函数参数类型为：");
            for(Class cc:c.getExceptionTypes()){
                println("    "+cc.getName());
            }
            println("");
        }

        Constructor c1 = Test.class.getConstructor();
        Constructor c2 = Test.class.getDeclaredConstructor(String.class);
        Constructor c3 = Test.class.getConstructor(String.class,int.class);
        Test t1 = (Test)c1.newInstance();
        Test t2 = (Test)c2.newInstance("呵呵");
        Test t3 = (Test)c3.newInstance("哒哒",45);
    }

    public static void println(String s){
        System.out.println(s);
    }
}
