package czy.demo.script.ecmascript;

import javax.script.*;

/* 编译脚本测试类 */
public class CompileTest {

    public static void main(String[] args)throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        /* 编译未执行脚本 */
        CompiledScript script = ((Compilable)engine).compile("a+4");

        /* 根据不同绑定值执行结果不同 */
        engine.put("a",1);
        System.out.println(script.eval());
        engine.put("a",2);
        System.out.println(script.eval());
    }

}
