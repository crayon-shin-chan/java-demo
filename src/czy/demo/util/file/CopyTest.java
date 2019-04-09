package czy.demo.util.file;


import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* Files是java8提供的文件工具类 */
public class CopyTest {

    public static void main(String[] args)throws Exception{

        Path src = Paths.get("src","czy","demo","util","file","CopyTest.java");
        Path target = Paths.get("src","czy","demo","util","file","Target.txt");

        /* 将Path指向文件拷贝到指定输出流 */
        Files.copy(src,System.out);

        /* 将源文件拷贝到目标Path */
        Files.copy(src,target);
    }

}
