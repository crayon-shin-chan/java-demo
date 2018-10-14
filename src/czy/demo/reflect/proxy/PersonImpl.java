package czy.demo.reflect.proxy;

/* 实现类,在调用处理器中使用其方法 */
public class PersonImpl implements Person{
	
    public void say(String content){
		System.out.println("enter original method");
    	System.out.println(content);
		System.out.println("leave original method");
    }
	
	public String sing(String song){
		System.out.println("enter original method");
		System.out.println("The song is "+song+".");
		System.out.println("leave original method");
		return "the song end";
	}
	
	public void play(String game){
		System.out.println("enter original method");
		if(game=="war3"){
			System.out.println("Could you put some bonus points in my drinking skills?\nAny fish and chips shops about here?");
		}else if(game=="age of empires"){
			System.out.println("太多的鸟从我的头上飞过。我的村民不会采酱果。难怪你会胜利。");
		}else{
			System.out.println("what the fuck!");
		}
		System.out.println("leave original method");
	}
	
	public void eat(String foot){
		System.out.println("enter original method");
		System.out.println("em em em em ma!");
		System.out.println("leave original method");
	}
	
	public void sleep(){		
		System.out.println("enter original method");
		System.out.println("hu hu hu hu lu !");
		System.out.println("leave original method");
	}

}
