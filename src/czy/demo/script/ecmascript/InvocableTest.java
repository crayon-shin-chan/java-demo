package czy.demo.script.ecmascript;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/* Invocable测试类 */
public class InvocableTest {

    public static void main(String[] args)throws ScriptException,NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        /* 必须实现了Invocable接口的引擎才可以直接调用脚本函数 */
        System.out.println("引擎实现类为: "+engine.getClass().getName());
        System.out.println("引擎是否实现了Invocable接口: "+(engine instanceof  Invocable));

        /* 定义函数 */
        engine.eval("function add(a,b){return a+b;}");

        /* 执行函数获取返回值 */
        Object result = ((Invocable)engine).invokeFunction("add",23,34);
        System.out.println("结果为: "+result);

        /* 定义构造函数 */
        engine.eval("function Person(name,age){this.name=name;this.age=age;}");
        /* 定义对象原型方法 */
        engine.eval("Person.prototype.add = function(a,b){return a+b+this.age;}");
        /* 获取对象 */
        Object person = engine.eval("new Person('张三',45)");
        /* 调用对象方法 */
        result = ((Invocable)engine).invokeMethod(person,"add",2,3);
        System.out.println("结果为: "+result);
    }

}
