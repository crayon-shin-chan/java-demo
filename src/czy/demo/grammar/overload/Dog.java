package czy.demo.grammar.overload;

public class Dog extends Animal{
	
	/*子类实现父类方法,但是方法返回值必须兼容
	 * 即返回类型必须相同,参数类型可以不同
	 * 这个属于方法重载,而不是方法重写,因为参数类型不同
	 * 调用子类getLength方法时,会根据不同参数类型进行调用
	 * 即此时Dog类拥有两个getLength方法,一个是父类继承的,另一个是子类自己的
	 * */
	public int getLength(float a){
		return 2;
	}

}
