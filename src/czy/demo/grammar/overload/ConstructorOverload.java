package czy.demo.grammar.overload;

public class ConstructorOverload {
	
	public ConstructorOverload(int i){
		System.out.println("调用整形参数构造函数");
	}
	
	public ConstructorOverload(float i){
		System.out.println("调用单精度浮点参数构造函数");
	}
	
	public ConstructorOverload(double i){
		System.out.println("调用双精度浮点参数构造函数");
	}

	public static void main(String[] args) {
		ConstructorOverload co = new ConstructorOverload(1);
		ConstructorOverload co1 = new ConstructorOverload(1.2);
		ConstructorOverload co2 = new ConstructorOverload(1.24f);
	}

}
