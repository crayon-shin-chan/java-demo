package czy.demo.rmi.client;

import czy.demo.rmi.Person;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Enumeration;

public class PersonClient {

    public static void main(String[] args)throws RemoteException,NamingException {
        Context context = new InitialContext();

        Enumeration<NameClassPair> e = context.list(Person.url);
        while(e.hasMoreElements()){
            System.out.println("发现远程对象:"+e.nextElement().getName());
        }
        Person zhangsan = (Person) context.lookup(Person.url+"zhangsan");
        Person lisi = (Person)context.lookup(Person.url+"lisi");
        System.out.println("zhangsan name is :"+zhangsan.name());
        System.out.println("lisi name is :"+lisi.name());


    }

}
