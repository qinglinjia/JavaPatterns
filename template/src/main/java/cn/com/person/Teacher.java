package cn.com.person;

import cn.com.template.Template;

/**
 * 老师
 *
 * @author jiaql
 * @create 2017-05-05 17:23
 */
public class Teacher extends Template {
    @Override
    public void dreessUp() {
        System.out.println("穿工作服");
    }

    @Override
    public void eatBreakFast() {
        System.out.println("做早饭，照顾孩子吃早饭");
    }

    @Override
    public void takeThings() {
        System.out.println("带上昨晚准备的考卷");
    }
}
