package czy.demo.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileTest {

    /* 使用相对路径创建文件，即开头不为/，会在项目根目录下创建文件
     * 使用绝对路径创建文件，即开头为/，会在当前磁盘根目录下创建文件，windows为D盘，linux为根挂载路径
     * 如果路径中出现不存在目录，抛出异常
     * 如果指定文件已存在，默认会删除重写
     */
    public static void main(String[] args)throws Exception{

        File file = new File("a.txt");

        say("文件名称为："+file.getName());
        say("文件路径为："+file.getPath());
        say("文件绝对路径为："+file.getAbsolutePath());
        say("文件父路径为："+file.getParent());
        say("文件转为字符串："+file.toString());


        /* 创建File对象不会生成文件，只有打开输出流时才会生成文件，不管是否写出数据 */
        OutputStream out = new FileOutputStream(file);

        out.write("我是新的文章内容".getBytes());

        out.close();
    }

    public static void say(Object o ){
        System.out.println(o);
    }

}
