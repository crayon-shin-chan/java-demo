package czy.demo.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {

    public static void main(String[] args)throws Exception{
        connect("localhost",3001);
    }

    public static void connect(String host,int port)throws Exception{
        Socket socket  = new Socket(host,port);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        new Thread(()->{
            byte[] buffer = new byte[1048];
            int length;
            try{
                while((length=in.read(buffer,0,1048))!=-1){
                    System.out.println("接收到服务器响应："+new String(buffer,0,length));
                }
                in.close();
            }catch(Exception ex){}
        }).start();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            if(str.contains("exit")){
                break;
            }
            out.write(str.getBytes());
        }
        out.close();

    }

}
