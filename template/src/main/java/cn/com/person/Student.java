package cn.com.person;

import cn.com.template.Template;

/**
 * 学生
 *
 * @author jiaql
 * @create 2017-05-05 17:22
 */
public class Student extends Template {
    @Override
    public void dreessUp() {
        System.out.println("穿校服");

    }

    @Override
    public void eatBreakFast() {
        System.out.println("吃妈妈做好的早饭");
    }

    @Override
    public void takeThings() {
        System.out.println("背书包，带上家庭作业和红领巾");
    }
}
