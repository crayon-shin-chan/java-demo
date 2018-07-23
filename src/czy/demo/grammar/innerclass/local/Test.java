package czy.demo.grammar.innerclass.local;

public class Test {


    public static void main(String[] args){
        User user = new User();
        Object card = user.getCard();

        /* 不是接口的情况下，就很尴尬，只能通过反射操作 */
        say("获取局部类为："+card.getClass().getName());

    }

    public static void say(String s){
        System.out.println(s);
    }

}
