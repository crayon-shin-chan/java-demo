package czy.demo.net.address;


import java.io.IOException;
import java.net.InetAddress;

public class LocalAreaNetworkTest {

    public static void main(String[] args)throws IOException {

        /* 直接使用本机局域网IP获取不到Local地址 */
        InetAddress server = InetAddress.getByName("192.168.2.201");
        AddressPrint.print(server);
    }

}
