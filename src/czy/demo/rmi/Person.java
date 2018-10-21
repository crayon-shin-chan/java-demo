package czy.demo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Person extends Remote {

    public static final String url = "rmi:";

    String name() throws RemoteException;

}
