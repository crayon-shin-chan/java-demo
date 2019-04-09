package czy.demo.util.file;

import java.nio.file.*;

/* Path代表了文件路径 */
public class PathTest {

    /* path如其名，代表了文件路径，可以一个个拼接文件路径
     * Path可以是文件也可以是目录
     */
    public static void main(String[] args){

        Path path = Paths.get("src","czy","demo","util","file");
        print(path);

        Path src = path.resolve("PathTest.java");
        print(src);
    }

    private static void print(Path path){
        System.out.println("是否为绝对路径："+path.isAbsolute());
        System.out.println("文件绝对路径为："+path.toFile().getAbsolutePath());
        System.out.println("是否为目录："+path.toFile().isDirectory());
        System.out.println("是否为文件："+path.toFile().isFile());
        System.out.println("是否存在："+path.toFile().exists());
    }

}
