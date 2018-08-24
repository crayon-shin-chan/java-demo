package czy.demo.script.ecmascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * js脚本简单测试类
 */
public class SimpleTest {

    public static void main(String[] args)throws ScriptException {

        ScriptEngineManager manager = new ScriptEngineManager();

        /* 获取指定语言的脚本引擎 */
        ScriptEngine engine = manager.getEngineByName("JavaScript");


        /* 按照这个执行方式,不使用return语句,直接返回最后的表达式值 */
        Object result = engine.eval("n = 12 ; n + 1");

        System.out.println("执行结果为: "+result);
    }


}
