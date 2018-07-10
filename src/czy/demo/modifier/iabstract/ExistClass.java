package czy.demo.modifier.iabstract;

/*抽象方法可以被继承*/
public class ExistClass extends AbstractClass{
	
	/*抽象类的子类,如果不是抽象类,必须实现父类所有抽象方法
	 * 即只有抽象类可以包含抽象方法,但是不是每一个抽象类都会包含抽象方法
	 * */
	public int get(){
		return 20;
	}

	/*子类方法的可见性不能低于父类,父类是public,子类必须是public*/
	public int hehe() {
		return 20;
	}
}
