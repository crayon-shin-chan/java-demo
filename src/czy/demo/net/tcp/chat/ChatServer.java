package czy.demo.net.tcp.chat;

import czy.demo.net.tcp.SocketPrint;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/* 聊天服务器 */
public class ChatServer {

    private static final int PORT = 3000;
    private static ServerSocket serverSocket = null;

    /* 客户端存储，键为用户名 */
    private static final Map<String,Socket> sockets = new HashMap<>();
    private static final Map<String,Writer> writers = new HashMap<>();

    /* 用户登录命令 */
    private static final String LOGIN_COMMAND = "login";

    /* 用户离开命令 */
    private static final String EXIT_COMMAND = "exit";

    /* 服务器关闭命令 */
    private static final String CLOSE_COMMAND = "close";

    /* 向所有用户发送消息 */
    private static void multicast(String message){
        writers.values().stream().forEach(writer1->{
            try{
                writer1.write(message+"\n");
                writer1.flush();
            }catch (Exception ex){

            }
        });
    }

    private static void multicast(String username,String message){
        multicast(username+" : "+message);
    }

    public static void main(String[] args)throws Exception{
        ServerSocket server = new ServerSocket(PORT);
        serverSocket = server;
        say("开始监听"+PORT+"端口");
        while(true){
            Socket socket = server.accept();
            say("接收到一个连接");
            SocketPrint.print(socket);
            /* 启动一个客户端处理线程 */
            new ClientThread(socket).start();
        }
    }

    private static class ClientThread extends Thread{

        private Socket socket;
        private Boolean isLogin = false;
        private String username = null;

        public ClientThread(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run(){
            say("客户端线程启动");
            InputStream in = null;
            OutputStream out = null;
            BufferedReader reader = null;
            BufferedWriter writer = null;

            try{
                in = socket.getInputStream();
                out = socket.getOutputStream();
                reader = new BufferedReader(new InputStreamReader(in));
                writer = new BufferedWriter(new OutputStreamWriter(out));
                String line = "";
                while ((line = reader.readLine()) != null){
                    say("准备读取下一行");
                    /* 读取一行 */
                    say("接收到数据："+line);
                    /* 未登录时判断登录逻辑 */
                    if(!isLogin){
                        /* 登录命令 */
                        if(line.startsWith(LOGIN_COMMAND)){
                            say("登录命令");
                            username = line.replace(LOGIN_COMMAND,"")
                                    .replaceAll(":","")
                                    .trim();

                            /* 用户名不能为空字符串 */
                            if(username.equals("")){
                                username = null;
                                continue;
                            }

                            /* 存储socket和输出流 */
                            sockets.put(username,socket);
                            writers.put(username,writer);
                            isLogin = true;
                        }else{
                            say("未登录");
                            writer.write("请先登录，再发送消息\n");
                            writer.flush();
                        }
                        continue;
                    }

                    /* 离开逻辑 */
                    if(line.startsWith(EXIT_COMMAND)){
                        sockets.remove(username);
                        writers.remove(username);
                        multicast("用户"+username+"即将离开聊天室\n");
                        break;
                    }

                    /* 服务器关闭逻辑 */
                    if(line.startsWith(CLOSE_COMMAND)){
                        multicast("聊天室将会在十秒后关闭");
                        long current = System.currentTimeMillis();
                        new Timer("显示计数器").schedule(new TimerTask() {
                            @Override
                            public void run() {
                                long seconds = (current-System.currentTimeMillis())/1000+10;
                                multicast(seconds+"");
                            }
                        },0,1000);
                        new Timer("关闭计数器").schedule(new TimerTask() {
                            @Override
                            public void run() {
                                try{
                                    serverSocket.close();
                                    System.exit(0);
                                }catch (Exception ex){

                                }

                            }
                        },10000);
                    }

                    multicast(username,line);
                }


            }catch (Exception ex){
                ex.printStackTrace();
            }finally {
                try{
                    if(in!=null){
                        in.close();
                    }
                    if(out!=null){
                        out.close();
                    }
                    if(reader!=null){
                        reader.close();
                    }
                    if(writer!=null){
                        writer.close();
                    }
                    if(socket != null && !socket.isClosed()){
                        socket.close();
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        }
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
