package czy.demo.grammar.innerclass.istatic;

public class Test {

    public static void main(String[] args){

        /* 创建静态内部类对象不需要外部类对象 */
        User.Card card = new User.Card("内部id");
    }

}
