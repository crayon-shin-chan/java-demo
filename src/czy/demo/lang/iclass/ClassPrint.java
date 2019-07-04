package czy.demo.lang.iclass;

import java.lang.reflect.Modifier;

/* Class对象打印类 */
public class ClassPrint {

    public static void print(Class c){

        /************ 四种类名 ***********/

        /* 普通类：czy.demo.lang.iclass.Person
         * 成员类：czy.demo.lang.iclass.MemberClassTest$Member
         * 本地类：czy.demo.lang.iclass.LocalClassTest$1Local
         */
        say("普通名称为："+c.getName());

        /* 普通类：czy.demo.lang.iclass.Person
         * 成员类：czy.demo.lang.iclass.MemberClassTest$Member
         * 本地类：czy.demo.lang.iclass.LocalClassTest$1Local
         */
        say("类型名称为："+c.getTypeName());

        /* 普通类：czy.demo.lang.iclass.Person
         * 成员类：czy.demo.lang.iclass.MemberClassTest.Member
         * 本地类：null
         */
        say("规范名称为："+c.getCanonicalName());

        /* Person */
        say("简单名称为："+c.getSimpleName());

        /************* 各种判断 **************/
        say("是否是简单类型："+c.isPrimitive());
        say("是否是接口："+c.isInterface());
        say("是否是数组类："+c.isArray());
        say("是否是注解类型："+c.isAnnotation());
        say("是否是枚举类："+c.isEnum());
        say("是否是本地类："+c.isLocalClass());
        say("是否是成员类："+c.isMemberClass());
        say("是否是匿名类："+c.isAnonymousClass());
        say("是否是合成类："+c.isSynthetic());

        /* 标识符掩码 */
        int modifiers = c.getModifiers();
        say("标识符掩码为："+modifiers);
        say("是否是类interface接口：："+Modifier.isInterface(modifiers));
        say("是否是abstract类："+Modifier.isAbstract(modifiers));
        say("是否是final类："+Modifier.isFinal(modifiers));
        say("是否是public类："+ Modifier.isPublic(modifiers));
        say("是否是private类："+Modifier.isPrivate(modifiers));
        say("是否是pretected类："+Modifier.isProtected(modifiers));
        say("是否是static类："+Modifier.isStatic(modifiers));









    }

    private static void say(Object o){
        System.out.println(o);
    }

}
