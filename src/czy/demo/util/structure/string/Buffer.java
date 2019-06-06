package czy.demo.util.structure.string;

public class Buffer {

	public static void main(String[] args) {

		/*StringBuffer是线程安全的,可以方便的拼接字符串
		 * 但是为了线程安全,牺牲了一部分性能
		 * */
		StringBuffer builder = new StringBuffer();
		System.out.println(builder);
		builder.append(true);
		System.out.println(builder);
		char[] arr = {'a','b','c','d','e','f','g'};
		builder.append(arr);
		System.out.println(builder);
		builder.append("aaaaaaas");
		System.out.println(builder);
		builder.delete(4,builder.length());
		System.out.println(builder);

	}

}
