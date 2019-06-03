package czy.demo.net.url;


import java.net.URL;

public class SimpleTest {

    public static void main(String[] args)throws Exception{
        URLPrint.print(new URL("http://user:pass@localhost:8080/context/user?a=1&b=2"));
    }

}
