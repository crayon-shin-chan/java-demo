package czy.demo.lang.iclass;

/* 枚举类不可继承，所以会认为它是final类 */
public class EnumTest {

    public static void main(String[] args){
        ClassPrint.print(Sex.class);
    }

}
