package czy.demo.script;


import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

/**
 * 脚本引擎测试类,用于查询当前可用的脚本引擎
 * 当前只有一个ECMAScript引擎
 */
public class ManagerTest {

    public static void main(String[] args){

        /* java中脚本调用开始于脚本引擎管理器 */
        ScriptEngineManager manager = new ScriptEngineManager();

        /* 遍历当前管理器中注册的所有脚本引擎 */
        for(ScriptEngineFactory factory:manager.getEngineFactories()){
            print(factory);
        }
    }


    public static void print(ScriptEngineFactory factory){
        System.out.println("脚本引擎名称为: "+factory.getEngineName());
        System.out.println("脚本引擎版本为: "+factory.getEngineVersion());
        System.out.println("脚本语言名称为: "+factory.getLanguageName());
        System.out.println("脚本语言版本为: "+factory.getLanguageVersion());
        System.out.println("脚本中名称为: ");
        for(String s:factory.getNames()){
            System.out.println("    "+s);
        }
        System.out.println("脚本中扩展为: ");
        for(String s:factory.getExtensions()){
            System.out.println("    "+s);
        }
        System.out.println("脚本中MIME类型为: ");
        for(String s:factory.getMimeTypes()){
            System.out.println("    "+s);
        }
    }

}
