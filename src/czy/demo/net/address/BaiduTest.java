package czy.demo.net.address;


import java.net.InetAddress;

public class BaiduTest {

    public static void main(String[] args)throws Exception{
        /* 可以直接使用域名构造，这一步会走DNS解析 */
        InetAddress baidu = InetAddress.getByName("baidu.com");
        AddressPrint.print(baidu);

    }

}
