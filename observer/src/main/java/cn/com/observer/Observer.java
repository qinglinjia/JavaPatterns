package cn.com.observer;

import cn.com.object.AllyControlCenter;

/**
 * 抽象观察类
 *
 * @author jiaql
 * @create 2017-05-05 16:15
 */
public interface Observer {

    String getName();

    void setName(String name);

    void help(); //声明支援盟友方法

    void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}
