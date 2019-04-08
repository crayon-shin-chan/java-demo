package czy.demo.util.file;

import java.nio.file.*;

/* Path代表了文件路径 */
public class PathTest {

    public static void main(String[] args){
        Path path = Paths.get("src","czy","demo","util","file");

        System.out.println("是否为绝对路径："+path.isAbsolute());
        Path src = path.resolve("PathTest.java");
        System.out.println("文件绝对路径为："+src.toFile().getAbsolutePath());
    }

}
