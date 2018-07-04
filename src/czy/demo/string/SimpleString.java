package czy.demo.string;

public class SimpleString {

	public static void main(String[] args) {

		/*java里面有字符串常量池
		 * 以常量形式出现的字符串先从常量池中获取
		 * 所以两个字符串引用a与b指向一个位置
		 * */
		String a = "hehe";
		String b = "hehe";
		System.out.println(a==b);
		
		/*以对象形式创建的String不会在常量池中获取,
		 *而是在堆中获取
		 */
		String c  = new String("hehe");
		System.out.println(a==c);

		
	}

}
