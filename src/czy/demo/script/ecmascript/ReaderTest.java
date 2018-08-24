package czy.demo.script.ecmascript;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* 脚本文件以Reader形式传入 */
public class ReaderTest {

    public static void main(String[] args)throws FileNotFoundException,ScriptException {

        ScriptEngineManager manager = new ScriptEngineManager();

        ScriptEngine engine = manager.getEngineByName("JavaScript");

        /* 脚本文件可以转换为Reader执行 */
        Object result = engine.eval(new InputStreamReader(ReaderTest.class.getResourceAsStream("test.js")));

        System.out.println("执行结果为: "+result);
    }

}
