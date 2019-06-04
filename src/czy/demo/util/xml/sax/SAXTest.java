package czy.demo.util.xml.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXTest {

    public static void main(String[] args)throws Exception{

        /* 解析器工厂 */
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        /* 解析器 */
        SAXParser newSAXParser = saxParserFactory.newSAXParser();
        /* 传入文件路径与处理器 */
        newSAXParser.parse("src/czy/demo/util/xml/test.xml", new XMLParseHander());
    }

}
