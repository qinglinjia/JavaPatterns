package cn.com.prototype.shallowClone;

import cn.com.prototype.attachment.AttachmentShallow;

/**
 * 浅克隆
 *
 * @author jiaql
 * @create 2017-04-26 14:38
 */
public class WeeklyLogShallow implements Cloneable {

    private AttachmentShallow attachment;

    private String name;
    private String date;
    private String content;

    public AttachmentShallow getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentShallow attachment) {
        this.attachment = attachment;
    }

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

    // 使用clone()方法实现浅克隆
    public WeeklyLogShallow clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLogShallow) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
