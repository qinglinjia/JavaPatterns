package cn.com.prototype.deepClone;

import cn.com.prototype.attachment.AttachmentDeep;

import java.io.*;

/**
 * 深克隆
 *
 * @author jiaql
 * @create 2017-04-26 14:53
 */
public class WeeklyLogDeep implements Serializable {

    private AttachmentDeep attachment;

    private String name;
    private String date;
    private String content;

    public AttachmentDeep getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentDeep attachment) {
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

    public WeeklyLogDeep deepClone() {
        //将对象写入流中
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (WeeklyLogDeep) ois.readObject();
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
