package czy.demo.util.xml.dom;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* document object module，文档对象模型 */
public class DomTest {

    private static final Logger logger = Logger.getLogger(DomTest.class.getName());

    public static void main(String[] args)throws  Exception{

        /* 文档构建器工厂 */
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        /* 开启验证 */
        factory.setValidating(true);
        /* 是否支持命名空间 */
        factory.setNamespaceAware(false);
        /* 忽略注解，<!---->形式的注解会被当做空白 */
        factory.setIgnoringComments(false);
        /* 忽略内容空白，即解析时消除可忽略的空格 */
        factory.setIgnoringElementContentWhitespace(true);
        /* 是否合并CDATA节点 */
        factory.setCoalescing(false);
        /* 是否展开实体引用节点 */
        factory.setExpandEntityReferences(true);

        /* 文档构建器 */
        DocumentBuilder builder = factory.newDocumentBuilder();

        /* 设置错误处理器 */
        builder.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                logger.log(Level.WARNING,"警告信息",exception);
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                logger.log(Level.FINE,"错误信息",exception);
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                logger.log(Level.FINEST,"严重错误",exception);
            }
        });

        Document dom = builder.parse("src/czy/demo/util/xml/test.xml");

        /* 打印dom */
        Source oldData = new DOMSource(dom);
        StreamResult newData = new StreamResult(new StringWriter());
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.transform(oldData, newData);
        System.out.println(newData.getWriter());

    }

}
