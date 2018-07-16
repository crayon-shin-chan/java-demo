package czy.demo.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileTest {

    /* 使用相对路径创建文件，即开头不为/，会在项目根目录下创建文件
     * 使用绝对路径创建文件，即开头为/，会在当前磁盘根目录下创建文件，windows为D盘，linux为根挂载路径
     * 如果路径中出现不存在目录，抛出异常
     */
    public static void main(String[] args)throws Exception{

        File file = new File("src/a.txt");

        /* 创建File对象不会生成文件，只有打开输出流时才会生成文件，不管是否写出数据 */
        OutputStream out = new FileOutputStream(file);

        out.write("我是文章内容".getBytes());

        out.close();
    }

}
