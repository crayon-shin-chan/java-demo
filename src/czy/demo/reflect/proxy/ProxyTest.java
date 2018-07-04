package czy.demo.reflect.proxy;

import java.lang.reflect.Proxy;

import czy.demo.reflect.proxy.Person;
import czy.demo.reflect.proxy.PersonImpl;
import czy.demo.reflect.proxy.PersonInvocationHandler;

public class ProxyTest {

	public static void main(String[] args) {
		PersonInvocationHandler invocatioHandler = new PersonInvocationHandler();
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
