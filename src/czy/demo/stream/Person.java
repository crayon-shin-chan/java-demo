package czy.demo.stream;

import java.io.Serializable;

/* 这里Serializable接口只是起到标识作用，如果不实现这个接口，在写入对象时会报错
 * 当实现Serializable接口后，不需要其他东西，即可正常序列化，默认情况下所有字段都会保存
 * 也不需要serialVersionUID
 */
public class Person implements Serializable{

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
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
        return "Person{" +"\n"+
                "    id=" + id +",\n"+
                "    name=" + name + ",\n" +
                "    age=" + age +"\n"+
                '}';
    }
}
