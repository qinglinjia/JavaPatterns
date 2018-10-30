package cn.com.prototype.attachment;

/**
 * 附件类
 *
 * @author jiaql
 * @create 2017-04-26 14:36
 */
public class AttachmentShallow {

    private String name; // 附件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void downLoad() {
        System.out.println("下载文件，文件名为：" + name);
    }
}
