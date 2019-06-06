package czy.demo.lang.reflect.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* Method测试类 */
public class Test {

    public void say(){
        System.out.println("呵呵");
    }

    /* 私有方法直接使用getMethod获取不到 */
    private void talk(){
        System.out.println("说悄悄话");
    }

    public static void hou(){
        System.out.println("静态方法吼吼！！1");
    }

    public int add(int i){
        return i+10;
    }

    public void throwing(){
        throw  new RuntimeException("hehe");
    }

    public static void main(String[] args) throws NoSuchMethodException,IllegalAccessException,InvocationTargetException {

        /* 获取方法列表，获取不到private标识的方法 */
        Method[] declare = Test.class.getDeclaredMethods();
        println("获取到声明方法：即当前类声明的方法，不包括继承父类的方法，但是包括私有方法：");
        for(Method m:declare){
            println("方法名称为："+m.getName());
        }
        Method[] methods = Test.class.getMethods();
        println("获取到类的方法，不包括私有方法");
        for(Method m : methods){
            /* 即方法在继承链上最后一次被声明的类，如wait方法在Object类中声明 */
            println("声明方法的类为："+m.getDeclaringClass().getName());
            println("当前方法名为："+m.getName());
            println("当前方法标识符位："+Modifier.toString(m.getModifiers()));
            println("当前方法参数数量为："+m.getParameterCount());
            println("当前方法参数类型为：");
            for(Class c:m.getParameterTypes()){
                println("   "+c.getName());
            }
            println("当前方法原始参数类型为：");
            for(Type t:m.getGenericParameterTypes()){
                println("   "+t.getTypeName());
            }
            println("当前方法返回值类型为："+m.getReturnType().getName());
            println("当前方法原始返回值类型为："+m.getGenericReturnType().getTypeName());
            println("当前方法异常类型为：");
            for(Class c:m.getExceptionTypes()){
                println("   "+c.getName());
            }
            println("当前方法原始异常类型为：");
            for(Type t:m.getGenericExceptionTypes()){
                println("   "+t.getTypeName());
            }
            println("当前方法字符串形式为："+m.toString());
            println("当前方法原始字符串形式为："+m.toGenericString());
            println("当前方法默认值为："+m.getDefaultValue());
            println("");
        }

        Method say = Test.class.getMethod("say");
        say.invoke(new Test());
        /* 获取私有方法只能通过声明私有方法类的getDeclaredMethod来获取，这个私有方法调用并不需要设置访问性 */
        Method talk = Test.class.getDeclaredMethod("talk");
        talk.invoke(new Test());
        Method hou = Test.class.getMethod("hou");
        hou.invoke(null);
        Method throwing = Test.class.getDeclaredMethod("throwing");
        try {
            throwing.invoke(new Test());
        }catch (Exception ex){
            System.out.println("抛出了异常："+ex.getCause().getMessage());
            ex.printStackTrace();
        }
    }

    public String toString(){
        return "";
    }

    public static void println(String s){
        System.out.println(s);
    }

}


