package czy.demo.lang.iclass;

public class InstanceTest {

    public static void main(String[] args)throws Exception{
        /** Class可以直接实例化，必须要有默认构造函数 */
        String ins = String.class.newInstance();
        System.out.println(ins);
        User.class.newInstance();
    }

    private static class User{
        /** 没有无参构造函数会抛出异常 */
        public User(String name){

        }

    }

}
