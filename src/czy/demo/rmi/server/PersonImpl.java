package czy.demo.rmi.server;

import czy.demo.rmi.Person;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PersonImpl extends UnicastRemoteObject implements Person {

    private String name ;

    public PersonImpl(String name) throws RemoteException {
        this.name = name;
    }

    public String name() throws RemoteException{
        return name;
    }


}
