package czy.demo.net;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressTest {

    public static void main(String[] args)throws IOException{

        /* 本机在局域网中 */
        InetAddress local = InetAddress.getLocalHost();

        /* 循环域名localhost */
        InetAddress loop = InetAddress.getLoopbackAddress();
        InetAddress server = InetAddress.getByName("192.168.1.142");
        InetAddress baidu = InetAddress.getByName("baidu.com");
        print(local);
        print(loop);
        print(server);
        print(baidu);
    }

    public static void print(InetAddress address)throws IOException {

        /* 各种形式，可能为域名 */
        System.out.println("主机名为："+address.getHostName());

        /* 比为域名 */
        System.out.println("规范化主机名为："+address.getCanonicalHostName());

        System.out.println("IP地址为："+address.getHostAddress());
        byte[] ips = address.getAddress();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<ips.length;i++){
            if(i!=ips.length-1){
                /* byte为补码？需要这样才能获取整数 */
                builder.append((ips[i] & 255)+".");
            }else{
                builder.append(ips[i] & 255);
            }
        }
        System.out.println("ip地址为："+builder.toString());

        /* 所有都返回false */
        System.out.println("主机是否为本地："+address.isAnyLocalAddress());

        /* 所有都返回false */
        System.out.println("主机是否链接到本地："+address.isLinkLocalAddress());

        /* local返回true */
        System.out.println("主机是否循环回到本地："+address.isLoopbackAddress());
        System.out.println("主机是否可达："+address.isReachable(300));
        System.out.println();
    }

}
