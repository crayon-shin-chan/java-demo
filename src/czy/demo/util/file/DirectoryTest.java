package czy.demo.util.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* Files目录操作测试 */
public class DirectoryTest {

    public static void main(String[] args)throws Exception{
        Path path = Paths.get("src","czy","demo","util","file","test");
        /* 如果存在删除目录，不存在不干啥 */
        Files.deleteIfExists(path);
        /* 创建目录 */
        Files.createDirectories(path);
        Thread.sleep(5000);
        /* 删除目录，如果不存在抛出错误 */
        Files.delete(path);
    }

}
