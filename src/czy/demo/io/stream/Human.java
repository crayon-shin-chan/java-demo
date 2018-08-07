package czy.demo.io.stream;

import java.io.Serializable;

public class Human implements Serializable {

    /* 序列化id，IDE生成的serialVersionUID是根据类名，接口名，方法和属性等来生成的
     * 序列化版本号用于标识当前类，假如一个类序列化前后，版本号发生变化，那么序列化机制会拒绝载入对象
     * 也就是只要序列化版本号相同，就可以正常序列化，并不强制要求它要与类的字段、方法等挂钩
     */
    private static final long serialVersionUID = -1L;
    private int id;
    private String name;
    private int age;

    public Human(int id, String name, int age) {
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

    @Override
    public String toString() {
        return "Human{" +"\n"+
                "    id=" + id +",\n"+
                "    name=" + name + ",\n" +
                "    age=" + age +"\n"+
                '}';
    }
}
