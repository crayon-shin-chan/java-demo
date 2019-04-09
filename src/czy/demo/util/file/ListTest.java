package czy.demo.util.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 目录列表测试 */
public class ListTest {

    public static void main(String[] args)throws Exception{
        Path path = Paths.get("src");
        print(path);
    }

    private static void print(Path src)throws Exception{
        System.out.println("文件路径："+src.toFile().getAbsolutePath());
        Files.list(src).forEach(path->{
            try {
                print(path);
            }catch (Exception ex){

            }
        });
    }

}
