package czy.demo.grammar.innerclass.member;

public class Test {

    public static void main(String[] args){

        /* 创建外部类对象时，并不会创建内部类对象，因为外部类对象不依赖于内部类对象存在 */
        User user = new User("外部id","张三",21);

        /* 创建内部类对象时，需要使用一个外部类对象来调用构造函数，可见内部类对象依赖于外部类对象 */
        User.Card card = user.new Card("内部id");

        System.out.println("创建的内部Card对象为：");
        System.out.println(card.toString());
    }

}
