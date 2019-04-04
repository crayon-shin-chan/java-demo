package czy.demo.util.unsafe;

/* Unsafe测试对象类 */
public class User {

    private int id;
    private Integer age;
    private String name;
    private String[] tags;

    public User(int id, Integer age, String name, String[] tags) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.tags = tags;
    }
}
