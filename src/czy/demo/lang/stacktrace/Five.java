package czy.demo.lang.stacktrace;

public class Five {

    public static Class findMain()throws ClassNotFoundException{
        StackTraceElement[] elements = new RuntimeException().getStackTrace();
        Class main = null;
        for(int i=0;i<elements.length;i++){
            say("当前调用栈为："+elements[i].getFileName()+":"+elements[i].getClassName()+":"+elements[i].getMethodName()+":"+elements[i].getLineNumber());
            if("main".equals(elements[i].getMethodName())){
                say("查找到主类为："+elements[i].getClassName());
                main =  Class.forName(elements[i].getClassName());
            }
        }
        return main;
    }

    public static void say(String s){
        System.out.println(s);
    }

}
