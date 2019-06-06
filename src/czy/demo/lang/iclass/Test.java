package czy.demo.lang.iclass;

import java.lang.reflect.Modifier;

public class Test {

    class Member{

    }

    public static void main(String[] args){

        Class person = Person.class;
        Person per = new Person();
        /* 简名即只有一个Person */
        System.out.println("Person类简名为:"+person.getSimpleName());
        System.out.println("Person类名为:"+person.getName());
        System.out.println("Person类规范名称为:"+person.getCanonicalName());
        System.out.println("Person类类型名为:"+person.getTypeName());
        int modifier = person.getModifiers();
        System.out.println("Person类标识符为:"+modifier);
        System.out.println("Person类是否为public标识:"+Modifier.isPublic(modifier));
        System.out.println("Person类是否是注解:"+person.isAnnotation());
        System.out.println("Person类是否是匿名类:"+person.isAnonymousClass());
        System.out.println("Person类是否是数组类:"+person.isArray());
        System.out.println("Person类是否为接口:"+person.isInterface());
        System.out.println("Person类是否为枚举:"+person.isEnum());
        System.out.println("Person类是否是本地类:"+person.isLocalClass());
        System.out.println("Person类是否是成员类:"+person.isMemberClass());
        System.out.println("Person类是否是原始类型:"+person.isPrimitive());
        System.out.println("Person类是否是合成类:"+person.isSynthetic());
        System.out.println("person类对象的类名为:"+person.getClass().getName());
        System.out.println("per对象是否是Person类的实例:"+person.isInstance(per));
        /* Object类对象是否可以被设置为Person类对象,即Object类是否是Person类的接口或者超类,或者相同 */
        System.out.println("Person类是否是Object的子类:"+Object.class.isAssignableFrom(person));

        class Local{
        };

        System.out.println("Person[]是否是数组类:"+Person[].class.isArray());
        System.out.println("int是否是原始类型:"+int.class.isPrimitive());
        System.out.println("Local类是否是本地类:"+Local.class.isLocalClass());
        System.out.println("Member类是否是成员类:"+Member.class.isMemberClass());
        System.out.println("是否是匿名类:"+new Anonymous(){}.getClass().isAnonymousClass());

    }


}
