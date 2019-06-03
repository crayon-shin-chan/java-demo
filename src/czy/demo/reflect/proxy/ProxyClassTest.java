package czy.demo.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyClassTest {

	public static void main(String[] args) throws Throwable {

		/* 调用处理器 */
		PersonInvocationHandler invocatioHandler = new PersonInvocationHandler();

		/* 获取代理类com.sun.proxy.$Proxy0,这个类是所有代理在运行时生成的类,实现了指定接口,代理类创建之后就成为了常规类 */
		Class proxyClass = Proxy.getProxyClass(PersonImpl.class.getClassLoader(), PersonImpl.class.getInterfaces());

		/* 生成代理对象 */
		Person proxy = (Person) proxyClass.getConstructor(InvocationHandler.class).newInstance(invocatioHandler);

		System.out.println("Proxy class :");
		System.out.println(proxyClass.getName());
		proxy.say("I'm a proxy,this is my first say something.");
		System.out.println("================");
		String result = proxy.sing("not an end!");
		System.out.println("The sing result is :\n" + result);
		System.out.println("================");
		proxy.eat("pig");
		System.out.println("================");
		proxy.play("war3");
	}

}
