package czy.demo.net.http;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HTTPURLTest {

    public static void main(String[] args){

    }

    public static void request(String path,String method,Map<String,String> headers,byte[] body)throws Exception{
        URL url = new URL(path);
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod(method);
        con.setDoInput(true);
        con.setDoOutput(true);
        if(headers!=null){
            for(Map.Entry<String,String> entry:headers.entrySet()){
                con.setRequestProperty(entry.getKey(),entry.getValue());
            }
        }
        BufferedOutputStream out = new BufferedOutputStream(con.getOutputStream(),8024);
        out.write(body,0,body.length);
        con.connect();
    }
}
