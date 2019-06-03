package czy.demo.rmi.server;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class PersonServer {

    public static void main(String[] args)throws RemoteException,NamingException {
        PersonImpl zhangsan = new PersonImpl("张三");
        PersonImpl lisi = new PersonImpl("李四");
        Context context = new InitialContext();
        context.bind("rmi:zhangsan",zhangsan);
        context.bind("rmi:lisi",lisi);
        System.out.println("注册表服务已启动");

    }


}
