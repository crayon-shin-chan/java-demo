package czy.demo.modifier.istatic;

public class StaticMethod {
	
	/*静态方法也有重载*/
	static int get(int a){
		return a+2;
	}
	
	static int get(float a){
		return (int)(a+1);
	}
	
	/*静态方法,可以在类自己的静态方法中直接调用
	 * 也可以使用类名调用
	 * 也可以使用类对象调用
	 * */
	private static void p(String s){
		System.out.println(s);
	}
	
	/*静态方法可以调用类构造函数*/
	static StaticMethod create(){
		return new StaticMethod();
	}
	
	/*静态方法可以被实例方法直接调用*/
	public int he(){
		return get(2);
	}

	public static void main(String[] args) {
		System.out.println(get(1));
		System.out.println(get(1.2f));
		p("吃饭");
		StaticMethod.p("喝水");
		StaticMethod staticMethod = new StaticMethod();
		staticMethod.p("打游戏");
		staticMethod.he();
	}

}
