package czy.demo.grammar.modifier.istatic;

public class StaticBlock {
	
	static int a = 1;
	
	/*静态块的执行是有顺序的,所有的静态块与静态变量一起顺序执行,后面的不能引用前面的*/
	static{
		System.out.println("静态块一");
		System.out.println(a);
		//System.out.println(b);
		a = 3;
		b = 12;
		System.out.println(a);
		//System.out.println(b);
	}
	
	static int b = 2;
	
	static{
		System.out.println("静态块二");
		System.out.println(a);
		System.out.println(b);
		a = 5;
		b = 18;
		System.out.println(a);
		System.out.println(b);
	}
	
	static{
		System.out.println("静态块三");
		
		/*静态块内不能声明静态变量*/
		//static int c = 2;
		
		/*静态块中可以调用类构造函数*/
		new StaticBlock();
	}

	public StaticBlock(){
		System.out.println("调用构造函数");
	}
	
	/*静态块在main方法之前运行*/
	public static void main(String[] args) {
		System.out.println("进入main方法");
	}
	
	/*静态块在main方法之前运行,不管声明顺序*/
	static{
		System.out.println("静态块四");
	}
	
	/**/
	static{
		System.out.println("静态块五");
		
		/*静态块的变量的块作用域*/
		int d = 10;
	}
	
	/**/
	static{
		System.out.println("静态块六");
		
		//System.out.println(d);
	}

}
