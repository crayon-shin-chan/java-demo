package czy.demo.util.math.calculation;

public class ExponentialFunctionTest {

    public static void main(String[] args){

        /**
         * Math.E为自然底数
         */
        System.out.println("自然底数为："+Math.E);
        System.out.println();


        /**
         * Math.exp()为自然底数的指数次幂
         * Math.log()为求自然对数
         */
        double r1 = Math.exp(2);
        System.out.println("e的平方为："+r1);
        System.out.println("对结果取自然对数为："+Math.log(r1));
        System.out.println();


        /**
         * Math.log10()为求10的对数
         */
        double r2 = Math.pow(10,4.7);
        System.out.println("10的4.7次方为："+r2);
        System.out.println("对结果取10的对数为："+Math.log10(r2));
        System.out.println();

    }

}
