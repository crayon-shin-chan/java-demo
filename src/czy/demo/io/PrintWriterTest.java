package czy.demo.io;

import java.io.PrintWriter;

public class PrintWriterTest {

    public static void main(String[] args){

        /**
         * 使用write想输出流打印字符时，不会加上换行符
         */
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("我是输出字符串，打印到屏幕上");
        pw.write("我是第二行输出字符串");
        pw.close();
    }


}
