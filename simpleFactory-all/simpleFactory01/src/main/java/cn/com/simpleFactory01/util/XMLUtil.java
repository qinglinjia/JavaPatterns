package cn.com.simpleFactory01.util;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author jiaql
 * @create 2017-04-25 13:50
 */
public class XMLUtil {
    /**
     * 读取配置文件内容
     *
     * @return
     */
    public static String getType() {
        String type = null;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(Thread.currentThread().getContextClassLoader().getResource("config.xml").getFile());
            NodeList nodeList = document.getElementsByTagName("chartType");
            type = nodeList.item(0).getFirstChild().getNodeValue().trim();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }

    public static void main(String[] args) {
        System.out.println(getType());
    }
}
