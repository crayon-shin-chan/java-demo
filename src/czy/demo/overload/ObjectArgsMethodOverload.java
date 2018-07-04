package czy.demo.overload;

import czy.demo.overload.Animal;
import czy.demo.overload.Dog;
import czy.demo.overload.Pig;

/*参数为对象时，首选最接近的类型
 * 如Dog，如果Dog参数类型方法不存在，则会选Animal参数类型方法
 * 即从当前子类开始递归向上查找以父类为参数类型的方法
 * */
public class ObjectArgsMethodOverload {

	public void test(Animal a){
		System.out.println("arg type is animal");
	}
	
	public void test(Dog a){
		System.out.println("arg type is dog");
	}
	
	public void test(Pig a){
		System.out.println("arg type is pig");
	}
	
	public static void main(String[] args) {
		ObjectArgsMethodOverload oa = new ObjectArgsMethodOverload();
		Animal animal = new Animal();
		Dog dog = new Dog();
		Pig pig = new Pig();
		oa.test(animal);
		oa.test(dog);
		oa.test(pig);
	}

}
