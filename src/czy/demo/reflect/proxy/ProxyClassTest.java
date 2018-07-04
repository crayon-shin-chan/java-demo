package czy.demo.reflect.proxy;

import java.lang.reflect.Proxy;

import czy.demo.reflect.proxy.Person;
import czy.demo.reflect.proxy.PersonImpl;
import czy.demo.reflect.proxy.PersonInvocationHandler;

import java.lang.reflect.InvocationHandler;

public class ProxyClassTest {

	public static void main(String[] args) throws Throwable {
		PersonInvocationHandler invocatioHandler = new PersonInvocationHandler();
		Class proxyClass = Proxy.getProxyClass(PersonImpl.class.getClassLoader(), PersonImpl.class.getInterfaces());
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
