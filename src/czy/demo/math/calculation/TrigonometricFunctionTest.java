package czy.demo.math.calculation;

public class TrigonometricFunctionTest {

    public static void main(String[] args){

        /**
         * 3.141592653589793，是个有限精度的玩意，是写死的双精度浮点数
         */
        System.out.println("圆周率为："+Math.PI);
        System.out.println();

        /**
         * 虽然π精度有限，但是正弦值是1.0，正切值为0.9999999999999999
         */
        System.out.println("π/2的正弦值为："+Math.sin(Math.PI/2));
        System.out.println("π的余弦值为："+Math.cos(Math.PI));
        System.out.println("π/4的正切值为："+Math.tan(Math.PI/4));

        System.out.println("1的反正弦值为："+Math.asin(1));
        System.out.println("-1的反余弦值为："+Math.acos(-1));
        System.out.println("1的反正切值为："+Math.atan(1));
    }

}
