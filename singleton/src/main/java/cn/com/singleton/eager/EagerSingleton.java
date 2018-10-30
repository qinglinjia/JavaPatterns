package cn.com.singleton.eager;

/**
 * 饿汉单例模式
 *
 * @author jiaql
 * @create 2017-04-24 14:34
 */
public class EagerSingleton {

    // 加载类时候就初始化实例
    private static final EagerSingleton instance = new EagerSingleton();

    // 私有无参构造函数
    private EagerSingleton() {

    }

    // 返回唯一实例
    public static EagerSingleton getInstance() {
        return instance;
    }
}
