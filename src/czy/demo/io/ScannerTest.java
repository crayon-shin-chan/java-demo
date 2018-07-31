package czy.demo.io;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args){
        nextInt();
        //line();
        //word();
    }

    /**
     * next按照单词来读取输入
     */
    public static void word(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            say("输入单词为："+scanner.next());
        }
    }

    /**
     * nextLine按照行来读取输入
     */
    public static void line(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            say("输入行为："+scanner.nextLine());
        }
    }

    /**
     * 按照整数来进行分词，其实也是按照单词来操作
     */
    public static void nextInt(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            say("输入整数为："+scanner.nextInt());
        }
    }

    public static void say(String s){
        System.out.println(s);
    }

}
