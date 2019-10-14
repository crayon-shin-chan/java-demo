package czy.demo.net.udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

    public static void main(String[] args)throws Exception{

        DatagramSocket socket = new DatagramSocket(9000);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        while(true){
            socket.receive(datagramPacket);
            System.out.println("接收到数据："+ new String(buf,0,datagramPacket.getLength()));
        }
    }

}
