package czy.demo.lang.iclass;

/* 本地类示例
 * 本地类，Local既是在方法中定义的类，本地类不能为static类型的
 * 本地类没有访问性标识符public、private、protected等
 */
public class LocalClassTest {

    public static void main(String[] args){
        class Local{

        }
        ClassPrint.print(Local.class);
    }

}
