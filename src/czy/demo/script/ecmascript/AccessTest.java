package czy.demo.script.ecmascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 脚本访问Java对象测试
 */
public class AccessTest {

    public static void main(String[] args)throws ScriptException {

        ScriptEngineManager manager = new ScriptEngineManager();

        ScriptEngine engine = manager.getEngineByName("JavaScript");

        Person person = new Person(1,"张三");

        /* java对象可以绑定到脚本中 */
        engine.put("person",person);

        engine.put("out",System.out);

        /* 可以在脚本中调用java对象方法,也可以为对象字段赋值 */
        engine.eval("out.println(person);person.id = 2;person.name = '李四'");

        System.out.println(person);

    }

    public static class Person{


        /* 这里的字段只有使用public修饰才能在脚本中被访问,否则为undefined */
        public Integer id;

        public String name;

        public Person(){}

        public Person(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
