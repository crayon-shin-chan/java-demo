package czy.demo.reflect.annotation.simple;

import java.lang.annotation.Annotation;

@ClassAnnotation(name="类注解")
public class Test {

    @FieldAnnotation(name="字段注解")
    private String he;

    @ConstructorAnnotation(name="构造函数注解")
    public Test(@ParameterAnnotation(name="参数注解") String name){}

    @MethodAnnotation(name="方法注解")
    public void say(@ParameterAnnotation(name="参数注解") String content){

        @LocalAnnotation(name="本地变量注解")
        String local = "哒哒哒";
        System.out.println(local);
    }

    public static void main(String[] args)throws Exception{
        Annotation[] classAnnotations =  Test.class.getAnnotations();
        Annotation[] fieldAnnotations = Test.class.getDeclaredField("he").getAnnotations();
        Annotation[] constructorAnnotations = Test.class.getConstructor(String.class).getAnnotations();
        Annotation[] parameterAnnotations = Test.class.getConstructor(String.class).getParameters()[0].getAnnotations();
        Annotation[] methodAnnotations = Test.class.getMethod("say",String.class).getAnnotations();
        Annotation[] packageAnnotations = Test.class.getPackage().getAnnotations();

        println("类注解为：");
        for(Annotation a:classAnnotations){
            println("name: "+((ClassAnnotation)a).name());
            println("value: "+((ClassAnnotation)a).value());
        }

        println("字段注解为：");
        for(Annotation a:fieldAnnotations){
            println("name: "+((FieldAnnotation)a).name());
            println("value: "+((FieldAnnotation)a).value());
        }

        println("构造函数注解为：");
        for(Annotation a:constructorAnnotations){
            println("name: "+((ConstructorAnnotation)a).name());
            println("value: "+((ConstructorAnnotation)a).value());
        }

        println("参数注解为：");
        for(Annotation a:parameterAnnotations){
            println("name: "+((ParameterAnnotation)a).name());
            println("value: "+((ParameterAnnotation)a).value());
        }

        println("方法注解为：");
        for(Annotation a:methodAnnotations){
            println("name: "+((MethodAnnotation)a).name());
            println("value: "+((MethodAnnotation)a).value());
        }

        println("包注解为：");
        for(Annotation a:packageAnnotations){
            println("name: "+((PackageAnnotation)a).name());
            println("value: "+((PackageAnnotation)a).value());
        }
    }

    public static void println(String s){
        System.out.println(s);
    }
}
