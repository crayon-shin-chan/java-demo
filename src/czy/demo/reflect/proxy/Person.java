package czy.demo.reflect.proxy;

/* 被代理的接口,可以针对接口生成代理对象,接口方法实现在调用处理器中 */
public interface Person {
	
	void say(String content);
	
	String sing(String song);
	
	void play(String game);
	
	void eat(String foot);
	
	void sleep();

}
