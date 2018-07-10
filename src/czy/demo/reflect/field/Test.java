package czy.demo.reflect.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* 反射Field类测试 */
public class Test {

    private String name;
    public int age;

    public Test(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) throws IllegalAccessException,NoSuchFieldException{
        Test test = new Test("张三",34);

        println("获取声明字段，即属于此类的字段，包括private字段：");
        /* 获取类本身声明的字段，包括私有字段，不包括继承父类的字段 */
        Field[] declare = Test.class.getDeclaredFields();
        for(Field f:declare){
            println("当前字段名称为："+f.getName());
            println("当前字段标识符为："+Modifier.toString(f.getModifiers()));
            println("当前字段声明类为："+f.getDeclaringClass().getName());
            println("当前字段类型为："+f.getType().getName());
            println("当前字段是否可访问："+f.isAccessible());
            println("当前字段在test对象中的值为："+f.get(test));
            println("");
        }

        println("获取类字段，即包括父类字段，但不包括private字段：");
        Field[] fields = Test.class.getFields();
        for(Field f:fields){
            println("当前字段名称为："+f.getName());
        }
        Field name = Test.class.getDeclaredField("name");
        Field age = Test.class.getField("age");
        name.set(test,"李四");
        age.set(test,231233);
        System.out.println("修改后name字段为："+test.name);
        System.out.println("修改后age字段为："+test.age);
    }

    public static void println(String s){
        System.out.println(s);
    }

}
