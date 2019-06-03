package czy.demo.net.address;


import java.net.InetAddress;

public class LocalTest {

    public static void main(String[] args)throws Exception {
        /* 获取local本机地址，并不是localhost */
        InetAddress address = InetAddress.getLocalHost();
        AddressPrint.print(address);
    }



}
