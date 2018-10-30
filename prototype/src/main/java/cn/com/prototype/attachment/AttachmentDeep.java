package cn.com.prototype.attachment;

import java.io.Serializable;

/**
 * 深克隆
 *
 * @author jiaql
 * @create 2017-04-26 14:58
 */
public class AttachmentDeep implements Serializable {

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
