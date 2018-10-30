package cn.com.singleton.lazy;

/**
 * 懒汉单例模式
 *
 * @author jiaql
 * @create 2017-04-24 14:34
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    // 单线程下的单例模式
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // 多线程下的单例模式
    public static LazySingleton getInstanceUseSynchronized() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
