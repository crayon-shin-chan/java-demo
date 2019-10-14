package czy.demo.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

    public static void main(String[] args)throws Exception{

        DatagramSocket datagramSocket = new DatagramSocket();
        int i=1;
        while(i<=10){
            String data = "这是第"+i+"次发送";
            /** 设置发送数据，长度，域名，端口 */
            DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost() , 9000);
            datagramSocket.send(packet);
            i++;
        }
        datagramSocket.close();

    }

}
