package cn.com.template;

/**
 * 模板
 *
 * @author jiaql
 * @create 2017-05-05 17:19
 */
public abstract class Template {

    /**
     * 抽象类定义整个流程骨架
     */
    public void prepareGotoSchool() {
        getUp();
        dreessUp();
        eatBreakFast();
        takeThings();
        walkIntoClassroom();
    }

    public void getUp() {
        System.out.println("开始起床。。。。。");
    }
    public abstract void dreessUp();

    public abstract void eatBreakFast();

    public abstract void takeThings();

    public void walkIntoClassroom() {
        System.out.println("走进教室。。。。。");
    }
}
