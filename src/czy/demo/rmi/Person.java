package czy.demo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Person extends Remote {

    public static String url = "rmi://127.0.1.1";

    String name() throws RemoteException;

}
