package czy.demo.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {


    public static void main(String[] args)throws Exception{
        PrintStream out = System.out;
        new Thread(()->{
            try{
                ServerSocket server = new ServerSocket(3001);
                out.println("开始监听3001端口：");
                while(true){
                    Socket socket = server.accept();
                    out.println("接收到连接："+socket.getRemoteSocketAddress());
                    InputStream in = socket.getInputStream();
                    OutputStream ou = socket.getOutputStream();
                    byte[] buffer = new byte[1048];
                    int length;
                    while((length = in.read(buffer))>0){
                        out.println(new String(buffer,0,length));
                        ou.write(buffer,0,length);
                    }
                    out.println("关闭套接字");
                    in.close();
                    ou.close();
                    socket.close();
                }
            }catch(Exception ex){

            }
        }).start();
        ServerSocket server2 = new ServerSocket(3002,5);
        ServerSocket server3 = new ServerSocket(3003,5,InetAddress.getByName("localhost"));
    }

}
