package czy.demo.grammar.innerclass.member;

/* 成员内部类，即内部类作为一个外部类的成员存在 */
public class User {

    private String id;
    private String name;
    private int age;

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    class Card{

        private String id;

        public Card(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        /* 在内部类中可以直接访问外部类属性，即默认内部类对象一定依存于一个外部类对象存在 */
        @Override
        public String toString(){
            StringBuilder builder = new StringBuilder();
            builder.append("外部类属性为：\n");
            /* 当发生属性覆盖时，需要使用外部类名.this访问外部属性 */
            builder.append("id:"+User.this.id+"\n");
            builder.append("name:"+name+"\n");
            builder.append("age:"+age+"\n");
            builder.append("内部类属性为：\n");
            builder.append("id:"+id+"\n");
            return builder.toString();
        }

    }
}
