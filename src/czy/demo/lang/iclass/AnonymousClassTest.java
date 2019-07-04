package czy.demo.lang.iclass;

/* 匿名类示例，匿名类是没有类声明直接使用类对象的类
 * 匿名类的名称与继承的接口或者父类无关，只与创建它的类有关，例如：
 * czy.demo.lang.iclass.AnonymousClassTest$1
 * czy.demo.lang.iclass.AnonymousClassTest$2
 * 匿名类没有规范名称
 * 所有的匿名类都是static类
 */
public class AnonymousClassTest {

    public static void main(String[] args){

        /* 最简单的匿名类就是创建接口的一个匿名类的实例 */
        ClassPrint.print(new Anonymous(){}.getClass());

        /* 也可以创建一个类的匿名子类的实例 */
        ClassPrint.print(new Object(){}.getClass());
    }

}
