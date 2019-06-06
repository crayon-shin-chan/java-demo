package czy.demo.nio.charset;


import java.nio.charset.Charset;

public class DefaultCharsetTest {

    /* 默认字符集为sun.nio.cs.UTF_8 */
    public static void main(String[] args){
        CharsetPrint.print(Charset.defaultCharset());
    }

}
