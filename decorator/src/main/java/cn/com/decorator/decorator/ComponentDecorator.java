package cn.com.decorator.decorator;

import cn.com.decorator.componet.Component;

/**
 * 构建装饰类：抽象装饰类
 *
 * @author jiaql
 * @create 2017-05-04 14:28
 */
public abstract class ComponentDecorator {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}
