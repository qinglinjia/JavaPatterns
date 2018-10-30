package cn.com.prototype.managerment.document;

/**
 * 可行性分析报告(Feasibility Analysis Report)类
 *
 * @author jiaql
 * @create 2017-04-26 16:21
 */
public class FAR implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("不支持克隆");

        }
        return far;
    }

    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
