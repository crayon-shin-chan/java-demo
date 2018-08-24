package czy.demo.script.ecmascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/* 使用put方法向引擎中添加变量绑定 */
public class PutTest {

    public static void main(String[] args)throws ScriptException {

        ScriptEngineManager manager = new ScriptEngineManager();

        ScriptEngine engine = manager.getEngineByName("JavaScript");

        /* 使用put直接向引擎中添加变量 */
        engine.put("k","呵呵大");

        Object result1 = engine.eval("k+'nimei'");

        System.out.println("执行结果为: "+result1);

        engine.put("k","可可大");

        Object result2 = engine.eval("k+'nijie'");

        System.out.println("执行结果为: "+result2);

    }

}
