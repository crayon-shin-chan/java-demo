package czy.demo.script.ecmascript;


import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/* 脚本引擎中可以使用各种形式添加变量绑定 */
public class BindingTest {

    public static void main(String[] args)throws ScriptException {

        ScriptEngineManager manager = new ScriptEngineManager();

        ScriptEngine engine = manager.getEngineByName("JavaScript");

        /* 创建一个绑定对象 */
        Bindings bindings = engine.createBindings();

        /* 向绑定中添加变量 */
        bindings.put("k","hehe");

        /* 执行脚本时,加入绑定 */
        Object result = engine.eval("k+'你妹'",bindings);

        System.out.println("执行结果为: "+result);
    }




}
