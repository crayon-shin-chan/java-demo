package czy.demo.lang.iclass;

/* 数组类示例，所有数据类都没有明确的类定义
 * 数组类由运行时根据需要创建
 * 标识符：abstract、final、public
 * 普通名称：[I
 * 类型名称：int[]
 * 规范名称：int[]
 * 简单名称：int[]
 */
public class ArrayClassTest {

    public static void main(String[] args){

        ClassPrint.print(int[].class);

    }

}
