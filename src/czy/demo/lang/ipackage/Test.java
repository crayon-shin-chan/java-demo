package czy.demo.lang.ipackage;

public class Test {


    public static void main(String[] args)throws Exception{
        Package pack = Test.class.getPackage();
        say("包名为："+pack.getName());
        say("实现标题为："+pack.getImplementationTitle());
        say("实现vendor为："+pack.getImplementationVendor());
        say("实现版本为："+pack.getImplementationVersion());
        say("指定标题为："+pack.getSpecificationTitle());
        say("指定vendor为："+pack.getSpecificationVendor());
        say("指定版本为："+pack.getSpecificationVersion());
        say("");

        Package lang = Package.getPackage("java.lang");
        say("包名为："+lang.getName());
        say("实现标题为："+lang.getImplementationTitle());
        say("实现vendor为："+lang.getImplementationVendor());
        say("实现版本为："+lang.getImplementationVersion());
        say("指定标题为："+lang.getSpecificationTitle());
        say("指定vendor为："+lang.getSpecificationVendor());
        say("指定版本为："+lang.getSpecificationVersion());
        say("");
    }

    public static void say(String s){
        System.out.println(s);
    }
}
