package cn.com.prototype.util;

import cn.com.prototype.attachment.AttachmentShallow;
import cn.com.prototype.shallowClone.WeeklyLogShallow;

/**
 * 浅克隆测试
 *
 * @author jiaql
 * @create 2017-04-26 14:40
 */
public class WeeklyLogShallowTest {

    public static void main(String[] args) {
        WeeklyLogShallow log_previous;

        log_previous = new WeeklyLogShallow();

        AttachmentShallow attachment = new AttachmentShallow();

        log_previous.setAttachment(attachment);

        WeeklyLogShallow log_new = log_previous.clone();

        //比较周报
        System.out.println("周报是否相同？ " + (log_previous ==  log_new));
        //比较附件
        System.out.println("附件是否相同？ " +  (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
