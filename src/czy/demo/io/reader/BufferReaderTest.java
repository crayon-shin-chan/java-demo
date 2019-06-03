package czy.demo.io.reader;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

public class BufferReaderTest {

    private static final String content = "aaaaaaa\n\rbbbbbbb\b\rccccccc";

    public static void main(String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(content.getBytes())));
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }


}
