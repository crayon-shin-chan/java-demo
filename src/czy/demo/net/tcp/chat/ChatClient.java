package czy.demo.net.tcp.chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/* 聊天客户端 */
public class ChatClient {

    public static void main(String[] args)throws Exception{
        connect("localhost",3000);
    }

    public static void connect(String host,int port)throws Exception{
        Socket socket  = new Socket(host,port);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        PrintWriter console = new PrintWriter(new OutputStreamWriter(System.out));
        new ScannerThread(writer).start();
        String line ;
        /* 从socket读取一行，向控制台写一行 */
        while ((line = reader.readLine())!=null){
            /* 这边输出也要flush */
            console.write(line);
            console.flush();
        }
        System.out.println("离开系统");
    }

    private static class ScannerThread extends Thread{

        private BufferedWriter writer;

        public ScannerThread(BufferedWriter writer){
            this.writer = writer;
        }

        @Override
        public void run() {
            try{
                Scanner scanner = new Scanner(System.in);
                /* 从控制台读取一行，向socket写一行 */
                while (true){
                    String line = scanner.nextLine();
                    System.out.println("控制台输入"+line);
                    /* 读取数据使用readLine，所以这里必须添加换行符 */
                    writer.write(line+"\n");
                    /* 这里写数据之后必须立即调用flush，否则会等待缓冲区填满 */
                    writer.flush();
                }
            }catch (Exception ex){

            }
        }
    }


}
