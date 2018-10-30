package cn.com.decorator;

import cn.com.decorator.componet.Component;
import cn.com.decorator.componet.Window;
import cn.com.decorator.decorator.ComponentDecorator;
import cn.com.decorator.decorator.ScrollBarDecorator;

/**
 * 测试装饰类
 *
 * @author jiaql
 * @create 2017-05-04 14:36
 */
public class Client {

    public static void main(String[] args) {
        Component component;
        component = new Window();
        ComponentDecorator componentSB = new ScrollBarDecorator(component);
        componentSB.display();

    }
}
