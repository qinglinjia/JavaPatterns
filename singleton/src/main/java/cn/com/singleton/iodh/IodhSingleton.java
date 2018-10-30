package cn.com.singleton.iodh;

/**
 * IODH方式实现单例模式
 * 在单例类中建立一个内部静态类
 *
 * @author jiaql
 * @create 2017-04-24 14:45
 */
public class IodhSingleton {

    private IodhSingleton() {

    }

    public static class HolderClass {
        private final static IodhSingleton instance = new IodhSingleton();
    }

    public static IodhSingleton getInstance() {
        return HolderClass.instance;
    }
}
