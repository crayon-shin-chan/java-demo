package czy.demo.reflect.proxy;

import java.lang.reflect.Proxy;

/* 直接创建代理对象 */
public class ProxyTest {

	public static void main(String[] args) {


		/* 调用处理器 */
		PersonInvocationHandler invocatioHandler = new PersonInvocationHandler();

		/* 直接使用类加载器,接口数组创建代理对象 */
		Person proxy = (Person) Proxy.newProxyInstance(
				PersonImpl.class.getClassLoader(),
				PersonImpl.class.getInterfaces(),
				invocatioHandler);

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
