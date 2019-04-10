package czy.demo.util.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

/* 目录列表测试 */
public class ListTest {

    private static int num = 0;

    public static void main(String[] args)throws Exception{
        Path path = Paths.get("src");
        print(path);
    }

    private static void print(Path src)throws Exception{

        System.out.println("文件路径："+src.toFile().getAbsolutePath()+"，数量："+(num++));

        /* 这个遍历不是多线程的，而是顺序的 */
        Files.list(src).forEach(path->{
            try {
                print(path);
            }catch (Exception ex){

            }
        });
    }

}
