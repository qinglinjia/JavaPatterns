package cn.com.prototype.util;

import cn.com.prototype.attachment.AttachmentDeep;
import cn.com.prototype.deepClone.WeeklyLogDeep;

/**
 * 深克隆测试
 *
 * @author jiaql
 * @create 2017-04-26 15:39
 */
public class WeeklyLogDeepTest {

    public static void main(String[] args) {
        WeeklyLogDeep log_previous = null, log_new = null;

        log_previous = new WeeklyLogDeep();

        AttachmentDeep attachment = new AttachmentDeep();

        log_previous.setAttachment(attachment);

        try {
            log_new = log_previous.deepClone();
        } catch (Exception e) {
            System.out.println();
        }

        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
    }

}
