package czy.demo.util.reflect;

import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;

/* Reflection是sun提供的反射工具，貌似获取调用者操作只能在引导类加载器和扩展类加载器加载代码中进行 */
public class ReflectionTest {

    @CallerSensitive
    public static void main(String[] args){
        new Caller().call();
    }

    /* 调用者 */

    private static class Caller{

        @CallerSensitive
        public void call(){
            new Callee().call();
        }

    }


    /* 被调用者 */
    private static class Callee{

        @CallerSensitive
        public void call(){
            Class caller = Reflection.getCallerClass();
            System.out.println("调用者类名为："+caller.getName());
        }

    }

}
