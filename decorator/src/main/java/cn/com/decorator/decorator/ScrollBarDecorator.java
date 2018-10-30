package cn.com.decorator.decorator;

import cn.com.decorator.componet.Component;

/**
 * 滚动条装饰类：具体装饰类
 *
 * @author jiaql
 * @create 2017-05-04 14:31
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("构建滚动条装饰类");
    }
}
