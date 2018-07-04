package czy.demo.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import czy.demo.reflect.proxy.PersonImpl;

public class PersonInvocationHandler implements InvocationHandler {

	private Person target = new PersonImpl();

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
