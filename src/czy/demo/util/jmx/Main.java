package czy.demo.util.jmx;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args)throws Exception{

        /* 创建MBean服务器 */
        MBeanServer server= ManagementFactory.getPlatformMBeanServer();

        Person person = new Person();

        /* 创建标识符,jmx为类别，下面Person为二级类别 */
        ObjectName objectName=new ObjectName("jmx:type=Person");
        /* 注册MBean */
        server.registerMBean(person, objectName);

        System.out.println("jmx started!!!");

        String name = "张三";
        Integer age = 10;
        person.setName(name);
        person.setAge(age);

        /* 使用jconsole修改MBean属性时，这里会进行打印 */
        while(true){
            if(!name.endsWith(person.getName()) || !age.equals(person.getAge())){
                System.out.println(person.getName()+":"+person.getAge());
                name = person.getName();
                age = person.getAge();
            }
            Thread.sleep(1000);
        }
    }

}
