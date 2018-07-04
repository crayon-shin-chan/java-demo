package czy.demo.iabstract;

import sun.security.action.GetBooleanAction;

/*使用abstract标识一个类*/
public abstract class AbstractClass {
	
	/*abstract不能修饰字段*/
	//abstract int a = 0;
	
	/*抽象方法不能包含方法体,即不能有大括号*/
	public abstract int get();
	
	/*抽象方法的可见性只能为public与protected
	 * 因为private方法对于子类是不可见的
	 * */
	public abstract int hehe();

}
