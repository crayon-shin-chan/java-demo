package czy.demo.util.jmx;

/* MBean基础接口，接口名称有MBean */
public interface PersonMBean {

    String getName();

    void setName(String name);

    Integer getAge();

    void setAge(Integer age);


}
