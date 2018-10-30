package cn.com.prototype.managerment;

import cn.com.prototype.managerment.document.FAR;
import cn.com.prototype.managerment.document.OfficialDocument;
import cn.com.prototype.managerment.document.SRS;

import java.util.Hashtable;

/**
 * //原型管理器（使用饿汉式单例实现）
 *
 * @author jiaql
 * @create 2017-04-26 16:19
 */
public class PrototypeManager {

    private final static PrototypeManager instance = new PrototypeManager();

    public static PrototypeManager getInstance() {
        return instance;
    }

    //定义一个Hashtable，用于存储原型对象
    private Hashtable ht = new Hashtable();

    //定义私有无参构造函数
    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    public OfficialDocument getOfficialDocument(String key) {
        // 通过浅克隆获取新的公文对象
        return ((OfficialDocument)ht.get(key)).clone();
    }
}
