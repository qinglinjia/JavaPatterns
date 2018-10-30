package cn.com.simpleFacotry02.util;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author jiaql
 * @create 2017-04-25 13:50
 */
public class XMLUtil {
    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     *
     * @return
     */
    public static Object getBean() {
        Object obj = null;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(Thread.currentThread().getContextClassLoader().getResource("config.xml").getFile());
            NodeList nodeList = document.getElementsByTagName("className");
            String type = nodeList.item(0).getFirstChild().getNodeValue().trim();

            Class c = Class.forName(type);
            obj = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static void main(String[] args) {
        System.out.println(getBean());
    }
}
