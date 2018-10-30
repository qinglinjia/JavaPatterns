package cn.com.simpleFactory03.factory;

import cn.com.simpleFactory03.product.AbstractProductA;
import cn.com.simpleFactory03.product.AbstractProductB;
import cn.com.simpleFactory03.product.ConcreteProductA1;
import cn.com.simpleFactory03.product.ConcreteProductB1;

/**
 * 具体工厂
 *
 * @author jiaql
 * @create 2017-04-26 10:58
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
