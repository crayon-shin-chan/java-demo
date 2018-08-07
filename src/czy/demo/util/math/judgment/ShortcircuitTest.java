package czy.demo.util.math.judgment;

/**
 * if后判断表达式，短路测试
 */
public class ShortcircuitTest {

    public static void main(String[] args){

        /**
         * 使用&&进行且逻辑运算
         * 左表达式为false，此时逻辑运算结果已经确定为false
         * 右表达式已经不需要被调用
         */
        System.out.println("进行且运算短路测试");
        if(f()&&t()){}
        System.out.println();


        /**
        * 使用&进行且逻辑运算
        * 就算左表达式为false，此时逻辑运算结果已经确定为false
        * 右表达式已经还是需要被调用
        */
        System.out.println("进行且运算不短路测试");
        if(f()&t()){}
        System.out.println();

        System.out.println("进行或运算短路测试");
        if(t()||f()){}
        System.out.println();

        System.out.println("进行或运算不短路测试");
        if(t()|f()){}
        System.out.println();



    }

    public static boolean t(){
        System.out.println("调用返回true方法");
        return true;
    }

    public static boolean f(){
        System.out.println("调用返回false方法");
        return false;
    }

}
