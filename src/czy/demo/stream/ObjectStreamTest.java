package czy.demo.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {


    public static void main(String[] args)throws Exception{

        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(out1);

        out.writeObject(new Person(1,"张三",12));
        out.writeObject(new Person(2,"李四",332));
        out.writeObject(new Human(3,"王五",1212));
        out.writeObject(new Human(4,"老六",33222));
        out.writeObject(new Humanity(5,"鬼脚七",1212121));
        out.writeObject(new Humanity(6,"老王八",9999));

        out1.close();
        out.close();

        ObjectInputStream in  = new ObjectInputStream(new ByteArrayInputStream(out1.toByteArray()));

        Person person1 = (Person)in.readObject();
        System.out.println("读取到的对象为：");
        System.out.println(person1);

        Person person2 = (Person)in.readObject();
        System.out.println("读取到的对象为：");
        System.out.println(person2);

        Human human1 = (Human)in.readObject();
        System.out.println("读取到的对象为：");
        System.out.println(human1);

        Human human2 = (Human)in.readObject();
        System.out.println("读取到的对象为：");
        System.out.println(human2);

        Humanity humanity1 = (Humanity)in.readObject();
        System.out.println("读取到对象为：");
        System.out.println(humanity1);

        Humanity humanity2 = (Humanity)in.readObject();
        System.out.println("读取到对象为：");
        System.out.println(humanity2);

        in.close();
    }
}
