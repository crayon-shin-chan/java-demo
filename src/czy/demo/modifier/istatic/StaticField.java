package czy.demo.modifier.istatic;

public class StaticField {
	
	/*静态字段声明具有顺序,后面的可以引用前面的
	 * 前面的不能引用后面的
	 * */
	//static int c = a+2;
	
	static int a = 1;
	
	/*静态方法可以访问静态字段,而且没有顺序之分*/
	static int getA(){
		return a;
	}
	
	static int getB(){
		return b;
	}
	
	static int b = a*2;
	
	/*实例方法也可以访问静态字段*/
	int he(){
		/*实例方法中static不能用来声明变量,final可以
		 * final变量不能被改变
		 * */
		final int b = 2;
		//b = 4;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
