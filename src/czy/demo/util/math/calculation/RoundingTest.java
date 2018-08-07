package czy.demo.util.math.calculation;

/**
 * 四舍五入测试类
 */
public class RoundingTest {

    public static void main(String[] args){

        /**
         * floor为向下取整函数，比较奇怪的是，返回值为double
         * 取整干嘛返回double
         */
        System.out.println("1.2向下取整为："+Math.floor(1.2));
        System.out.println("1.5向下取整为："+Math.floor(1.5));
        System.out.println("1.8向下取整为："+Math.floor(1.8));
        System.out.println();

        /**
         * ceil为向上取整函数
         */
        System.out.println("1.2向上取整为："+Math.ceil(1.2));
        System.out.println("1.5向上取整为："+Math.ceil(1.5));
        System.out.println("1.8向上取整为："+Math.ceil(1.8));
        System.out.println();

        /**
         * round为四舍五入取整函数
         */
        System.out.println("1.2四舍五入为："+Math.round(1.2));
        System.out.println("1.5四舍五入为："+Math.round(1.5));
        System.out.println("1.8四舍五入为："+Math.round(1.8));
    }

}
