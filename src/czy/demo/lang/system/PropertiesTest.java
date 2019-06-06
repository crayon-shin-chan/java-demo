package czy.demo.lang.system;


import java.util.Properties;

/* 属性是数据jdk的，虚拟机设置 */
public class PropertiesTest {

    public static void main(String[] args){
        Properties properties = System.getProperties();
        for(String name:properties.stringPropertyNames()){
            say("name："+String.format("%-20s",name)+"，value："+properties.get(name));
        }
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
