package czy.demo.net.address;


import java.net.InetAddress;

public class LoopbackTest {

    public static void main(String[] args)throws Exception{
        /* 本地环回域名localhost，地址为127.0.0.1 */
        InetAddress loop = InetAddress.getLoopbackAddress();
        AddressPrint.print(loop);
    }

}
