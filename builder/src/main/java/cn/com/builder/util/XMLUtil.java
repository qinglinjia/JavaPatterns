package cn.com.builder.util;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * 从XML配置文件中提取具体类类名，并返回一个实例对象
 *
 * @author jiaql
 * @create 2017-04-26 17:07
 */
public class XMLUtil {

    public static Object getBean() {

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(new File(Thread.currentThread().getContextClassLoader().getResource("config.xml").getFile()));

            NodeList nodeList = document.getElementsByTagName("className");

            Node node = nodeList.item(0).getFirstChild();

            String name = node.getNodeValue().trim();


            Class c = Class.forName(name);

            Object obj = c.newInstance();
            return obj;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
