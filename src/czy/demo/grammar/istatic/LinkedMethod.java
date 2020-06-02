package czy.demo.grammar.istatic;

public class LinkedMethod {

    public static LinkedMethod a(){
        System.out.println("a");
        return null;
    }

    public static LinkedMethod b(){
        System.out.println("b");
        return null;
    }

    public static void main(String[] args) {
        LinkedMethod.a().b();
    }

}
