package util;

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
 * @author jiaql
 * @create 2017-04-28 13:51
 */
public class XMLUtil {

    public static Object getBean(String args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(new File(Thread.currentThread().getContextClassLoader().getResource("config.xml").getFile()));

            NodeList nodeList = document.getElementsByTagName("className");

            Node node = null;

            if (args.equalsIgnoreCase("image.JPGImage")) {
                //获取第一个包含类名的节点，即扩充抽象类
                node = nodeList.item(0).getFirstChild();

            } else if (args.equals("apiImpl.WindowsImp")) {
                //获取第二个包含类名的节点，即具体实现类
                node = nodeList.item(1).getFirstChild();
            }
            String cName = node.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
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
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
