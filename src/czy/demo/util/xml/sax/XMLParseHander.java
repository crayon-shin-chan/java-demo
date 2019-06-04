package czy.demo.util.xml.sax;


import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.util.Arrays;

/* SAX解析处理器，sax为拉式解析，遇到合适事件时将触发事件回调 */
public class XMLParseHander extends DefaultHandler {

    private static String indentation = "";

    private static void increase(){
        indentation = indentation+" ";
    }

    private static void decrease(){
        indentation = indentation.substring(0,indentation.length()-1);
    }

    private static void say(Object o){
        System.out.println(indentation+o);
    }

    /* 文档解析开始时调用，该方法只会调用一次 */
    @Override
    public void startDocument() throws SAXException {
        say("开始文档解析");
        super.startDocument();
    }

    /* 文档解析结束时调用，该方法只会调用一次 */
    @Override
    public void endDocument() throws SAXException {
        say("结束文档解析");
        super.endDocument();
    }

    /* 标签（节点）解析开始时调用
     * uri：xml文档的命名空间
     * localName：标签的名字
     * qName：带命名空间的标签的名字
     * attributes：标签的属性集
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        say("开始元素，uri："+uri+"，localName："+localName+"，qName："+qName);
        for(int i=0;i<attributes.getLength();i++){
            say("元素属性，localName："+attributes.getLocalName(i)+"，type："+attributes.getType(i)+"，value："+attributes.getValue(i));
        }
        increase();
        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        decrease();
        say("结束元素，uri："+uri+"，localName："+localName+"，qName："+qName);
        super.endElement(uri, localName, qName);
    }


    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
        say("实体对象，publicId："+publicId+"，systemId："+systemId);
        return super.resolveEntity(publicId, systemId);
    }

    @Override
    public void notationDecl(String name, String publicId, String systemId) throws SAXException {
        say("符号声明，publicId："+publicId+"，systemId："+systemId+"，name："+name);
        super.notationDecl(name, publicId, systemId);
    }

    @Override
    public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException {
        say("未解析实体声明，publicId："+publicId+"，systemId："+systemId+"，name："+name+"，notationName："+notationName);
        super.unparsedEntityDecl(name, publicId, systemId, notationName);
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        say("文档定位，行数："+locator.getLineNumber()+"，列数："+locator.getColumnNumber());
        super.setDocumentLocator(locator);
    }



    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        say("开始前缀映射");
        super.startPrefixMapping(prefix, uri);
    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {
        say("结束前缀映射");
        super.endPrefixMapping(prefix);
    }

    /* 解析标签的内容的时候调，所有的标签之间的内容会被传给这个方法
     * ch：字符数组，整个文档内容
     * start：本次开始解析位置
     * length：本次解析长度
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        say("内容："+new String(Arrays.copyOfRange(ch,start,start+length)));
        super.characters(ch, start, length);
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        say("可忽略空白，ch："+new String(ch)+"，start："+start+"，length："+length);
        super.ignorableWhitespace(ch, start, length);
    }

    @Override
    public void processingInstruction(String target, String data) throws SAXException {
        say("执行指令，target："+target+"，data："+data);
        super.processingInstruction(target, data);
    }

    @Override
    public void skippedEntity(String name) throws SAXException {
        say("跳过实体，name："+name);
        super.skippedEntity(name);
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        say("发生警告");
        e.printStackTrace();
        super.warning(e);
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        say("发生错误");
        e.printStackTrace();
        super.error(e);
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        say("严重错误");
        e.printStackTrace();
        super.fatalError(e);
    }
}
