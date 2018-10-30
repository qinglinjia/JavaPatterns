package cn.com.prototype;

/**
 * 工作周报WeeklyLog：具体原型类
 *
 * @author jiaql
 * @create 2017-04-26 14:10
 */
public class WeeklyLog implements Cloneable{

    private String name;

    private String date;

    private String content;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException ex) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
