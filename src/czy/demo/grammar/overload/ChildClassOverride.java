package czy.demo.grammar.overload;

public class ChildClassOverride {

	public static void main(String[] args) {
		Animal animal  = new Animal();
		Dog dog = new Dog();
		/*调用父类方法*/
		System.out.println(animal.getLength(1));
		/*调用父类方法,因为参数类型为int*/
		System.out.println(dog.getLength(1));
		/*调用子类方法,参数类型为float*/
		System.out.println(dog.getLength(1.2f));

	}

}
