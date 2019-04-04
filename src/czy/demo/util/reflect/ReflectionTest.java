package czy.demo.util.reflect;

import sun.reflect.Reflection;

/* Reflection是sun提供的反射工具 */
public class ReflectionTest {

    public static void main(String[] args){
        new Caller().call();
    }

    /* 调用者 */
    private static class Caller{

        public void call(){
            new Callee().call();
        }

    }


    /* 被调用者 */
    private static class Callee{

        public void call(){
            Class caller = Reflection.getCallerClass();
            System.out.println("调用者类名为："+caller.getName());
        }

    }

}
