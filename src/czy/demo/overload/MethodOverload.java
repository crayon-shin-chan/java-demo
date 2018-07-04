package czy.demo.overload;

/*静态方法不能重载
 *重载方法返回值可以不同
 *会自动调用参数类型最合适的方法 
 * */
public class MethodOverload {
	
	public String test(int i){
		System.out.println("调用整形参数方法");
		return "a";
	}
	
	public void test(float i){
		System.out.println("调用单精度浮点参数方法");
	}
	
	public void test(double i){
		System.out.println("调用双精度浮点参数方法");
	}


	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		mo.test(1);
		mo.test(12.2);
		mo.test(1.0f);
	}

}
