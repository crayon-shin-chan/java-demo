package czy.demo.structure.number;

public class IntegerTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(300);
		Integer i2 = new Integer("300");
		Integer i3 = new Integer(301);
		
		System.out.println("i1的byte值为:"+i1.byteValue());
		System.out.println("i1的short值为:"+i1.shortValue());
		System.out.println("i1的int值为:"+i1.intValue());
		System.out.println("i1的long值为:"+i1.longValue());
		System.out.println("i1的float值为:"+i1.floatValue());
		System.out.println("i1的double值为:"+i1.doubleValue());
		
		System.out.println("i1的字符串形式为:"+i1.toString());
		System.out.println("i1的二进制字符串为:"+Integer.toBinaryString(i1));
		/*八进制字符串为454没有前缀*/
		System.out.println("i1的八进制字符串为:"+Integer.toOctalString(i1));
		/*获取道德十六进制字符串为12c没有前缀*/
		System.out.println("i1的十六进制字符串为:"+Integer.toHexString(i1));
		
		System.out.println("i1与i2比较结果为:"+i1.compareTo(i2));
		System.out.println("i1与i3比较结果为:"+i1.compareTo(i3));
		
		System.out.println("i1与i2相等的结果为:"+i1.equals(i2));
		System.out.println("i1与i3相等的记过为:"+i1.equals(i3));
		
		/*十六进制数字必须有前缀0x*/
		System.out.println("十六进制字符串12c解码结果为:"+Integer.decode("0x12c"));
		
		System.out.println("i1翻转后结果为:"+Integer.reverse(i1));
		System.out.println("i1字节翻转后结果为:"+Integer.reverseBytes(i1)+",二进制为:"+Integer.toBinaryString(Integer.reverseBytes(i1)));
		
		System.out.println("i1二进制字符串中1位的数量为:"+Integer.bitCount(i1));
		System.out.println("i1二进制最高位1代表的十进制整数为:"+Integer.highestOneBit(i1));
		System.out.println("i1二进制最低位1代表的十进制整数为:"+Integer.lowestOneBit(i1));
	}

}
