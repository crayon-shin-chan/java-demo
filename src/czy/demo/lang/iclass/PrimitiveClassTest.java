package czy.demo.lang.iclass;

/* 简单类型示例
 * 简单类型的类名都是最简单的int、long之类
 * 标识符判断：abstract、final、public
 */
public class PrimitiveClassTest {

    public static void main(String[] args)throws Exception{
        ClassPrint.print(int.class);
        ClassPrint.print(Integer.TYPE);
    }

}
