package cn.com.simpleFactory03.factory;

import cn.com.simpleFactory03.product.AbstractProductA;
import cn.com.simpleFactory03.product.AbstractProductB;

/**
 * 抽象工厂
 *
 * @author jiaql
 * @create 2017-04-26 10:55
 */
public abstract class AbstractFactory {
    
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}
