package czy.demo.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import czy.demo.reflect.proxy.PersonImpl;

/* 调用处理器,创建代理对象时使用 */
public class PersonInvocationHandler implements InvocationHandler {

	private Person target = new PersonImpl();

	/**
	 * 处理代理对象方法调用时使用
	 * @param proxy:代理对象
	 * @param method:当前调用方法
	 * @param args:参数数组
	 * @return:方法调用返回值
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("the method is invoked is " + method.getName());
		System.out.println("the arguments is :");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i].toString());
		}
		if (method.getName() == "sing") {
			String result = (String) method.invoke(target, args);
			return result + "\nthis is proxy mark!";
		} else {
			/* 在方法调用时才会指定被代理的对象 */
			return method.invoke(target, args);
		}
	}
	
}
