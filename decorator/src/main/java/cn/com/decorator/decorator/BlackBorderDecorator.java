package cn.com.decorator.decorator;

import cn.com.decorator.componet.Component;

/**
 * 黑色边框装饰类：具体装饰类
 *
 * @author jiaql
 * @create 2017-05-04 14:33
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("装饰黑色边框");
    }
}
