package czy.demo.net.address;


import java.net.InetAddress;

public class IPV6Test {

    public static void main(String[] args)throws Exception{
        /* 这个地址为ipv6，而且为local地址 */
        InetAddress address = InetAddress.getByName("0:0:0:0:0:0:0:0");
        AddressPrint.print(address);
    }

}
