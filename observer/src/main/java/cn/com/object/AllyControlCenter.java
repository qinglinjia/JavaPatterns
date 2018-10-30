package cn.com.object;

import cn.com.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 战队控制中心类：目标类
 *
 * @author jiaql
 * @create 2017-05-05 16:09
 */
public abstract class AllyControlCenter {
    protected String allyName; // 战队名称
    protected List<Observer> players = new ArrayList<Observer>(); // 存储战斗成员

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
    //注册方法
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    //注销方法
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    //声明抽象通知方法
    public abstract void notifyObserver(String name);
}
