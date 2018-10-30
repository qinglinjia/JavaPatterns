package cn.com.prototype.managerment.document;

/**
 * 软件需求规格说明书(Software Requirements Specification)类
 *
 * @author jiaql
 * @create 2017-04-26 16:25
 */
public class SRS implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("不支持克隆");
        }
        return srs;
    }

    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
