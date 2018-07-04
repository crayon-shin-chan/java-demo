package czy.demo.string;

public class Builder {

	public static void main(String[] args) {

		/*StringBuilder是线程不安全的,可以方便的拼接字符串*/
		StringBuilder builder = new StringBuilder();
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
