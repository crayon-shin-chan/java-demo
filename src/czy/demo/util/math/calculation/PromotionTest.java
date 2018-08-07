package czy.demo.util.math.calculation;

/**
 * 加减乘除计算时,类型提升测试
 */
public class PromotionTest {

    public  static void main(String[] args){

        /** 默认情况下,使用常量对简单类型变量赋值
         *  最直接的整型常量默认为int
         *  赋值给byte short时会进行大小检查,大小合适则不需要强制转换
         *  赋值给long时,为放宽类型,不需要强制转换
         *  最直接的浮点常量为double类型,后缀f代表float类型
         */
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 1.2f;
        double f = 2.4;

        /**
         * byte short类型进行计算时返回值为int类型,这个叫做xx提升
         * 如下计算结果都是int类型,需要强制转换为short
         *         short r1 = a + a;
         *         short r2 = a-a;
         *         short r3 = a*a;
         *         short r4 = a/a;
         *         short r5 = b+b;
         *         short r6 = b-b;
         *         short r7 = b*b;
         *         short r8 = b/b;
         */
        int r1 = a + a;

        /**
         * 当byte short int 与 long混合计算时,返回值为long类型
         */
        long r2 = a + d;

        /**
         * 当byte short int long 与 float混合计算时,返回值为float类型
         */
        float r3 = a + e;

        /**
         * 同理,当double参与混合计算时,返回值为double类型
         */
        double r4 = a + f;

    }

}
