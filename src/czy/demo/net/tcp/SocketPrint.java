package czy.demo.net.tcp;


import java.net.Socket;

public class SocketPrint {

    public static void print(Socket socket)throws Exception{
        say("远程地址："+socket.getRemoteSocketAddress());
        say("是否为keeplive："+socket.getKeepAlive());
        say("本地地址："+socket.getLocalAddress().getHostAddress());
        say("本地端口："+socket.getLocalPort());
        say("地址为："+socket.getInetAddress().getHostAddress());
        say("端口为："+socket.getPort());
        say("接收缓冲区大小："+socket.getReceiveBufferSize());
        say("发送缓冲区大小："+socket.getSendBufferSize());
        say("是否绑定："+socket.isBound());
        say("是否连接："+socket.isConnected());
        say("是否关闭："+socket.isClosed());
        say("是否重用地址："+socket.getReuseAddress());
        say("是否OOB内联："+socket.getOOBInline());
        say("");
    }

    private static void say(Object o){
        System.out.println(o);
    }

}
