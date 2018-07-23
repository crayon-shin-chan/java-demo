package czy.demo.grammar.innerclass.local;

/* 局部内部类是在一个方法中临时创建的内部类 */
public class User {

    /** 局部内部类在外部完全无法访问，甚至在方法签名中也无法访问
     *  一般不会采用下面这种方式，一般的局部内部类都是实现了某个外部接口或者继承某个外部父类的类
     *  这样返回类型就可以使用接口类或者父类类型了
     */
    public Object getCard(){
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
        }
        return new Card("内部id");
    }

}
