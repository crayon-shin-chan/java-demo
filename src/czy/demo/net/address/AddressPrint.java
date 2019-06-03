package czy.demo.net.address;


import java.io.IOException;
import java.net.InetAddress;

public class AddressPrint {

    public static void print(InetAddress address)throws IOException {
        /* 本机运行获取到类名为java.net.Inet4Address */
        say("类名为："+address.getClass().getName());
        /* 这一步获取的不是域名，而是计算机全名SD-20170826FBCK */
        say("域名为："+address.getHostName());
        /* 这里也是计算机全名 */
        say("规范化域名为："+address.getCanonicalHostName());
        /* 获取到IP地址 */
        say("地址为："+address.getHostAddress());
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
        say("字节拼接的ip地址为："+builder.toString());
        say("是否为本地local地址："+address.isAnyLocalAddress());
        say("是否为链接本地地址："+address.isLinkLocalAddress());
        say("是否是本地环回地址："+address.isLoopbackAddress());
        say("2000毫秒是否可达："+address.isReachable(2000));
        say("是否为多播地址："+address.isMulticastAddress());
        say("是否为站点本地地址："+address.isSiteLocalAddress());
    }

    private static void say(Object o){
        System.out.println(o);
    }
}
