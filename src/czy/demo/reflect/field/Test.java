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

    public static void main(String[] args) throws IllegalAccessException{
        Test test = new Test("张三",34);
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
    }

    public static void println(String s){
        System.out.println(s);
    }

}
