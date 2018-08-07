package czy.demo.io.stream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Humanity implements Serializable {

    private int id;
    private String name;
    private int age;

    public Humanity(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* 这个方法不是Serializable接口的方法，不要求强制实现
     * 实现这个方法可以定制写入对象字段的方式，参数为写入对象的输出对象流
     */
    private void writeObject(ObjectOutputStream out)throws IOException {
        out.writeInt(this.id);
        out.writeUTF(this.name);
    }

    /* 实现这个方法可以定制读取对象字段的方式，参数为读取对象的输入对象流 */
    private void readObject(ObjectInputStream in)throws IOException, ClassNotFoundException{
        int id = in.readInt();
        String name = in.readUTF();
        this.setId(id);
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Humanity{" +"\n"+
                "    id=" + id +",\n"+
                "    name=" + name + ",\n" +
                "    age=" + age +"\n"+
                '}';
    }

}
