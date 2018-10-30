package cn.com.prototype.util;

import cn.com.prototype.managerment.PrototypeManager;
import cn.com.prototype.managerment.document.OfficialDocument;

/**
 * 原型管理器测试
 *
 * @author jiaql
 * @create 2017-04-26 16:38
 */
public class PrototypeManagerTest {
    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getInstance();
        OfficialDocument doc1, doc2, doc3, doc4;

        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);
    }
}
