package cn.com.singleton.loadBalance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 模拟负载均衡
 *
 * @author jiaql
 * @create 2017-04-24 13:55
 */
public class LoadBalance {

    // 私有静态变量，存储唯一实例
    private static LoadBalance instance = null;

    // 服务器集合
    private List serverList = null;

    // 私有无参构造函数
    private LoadBalance() {
        serverList = new ArrayList();
    }

    // 公有静态成员方法，返回唯一实例
    public static LoadBalance getInstance() {
        if (instance == null) {
            // 实例化instance
            instance = new LoadBalance();
        }
        return instance;
    }

    // 增加服务
    public void addServer(String server) {
        serverList.add(server);
    }

    // 删除服务
    public void deleteServer(String server) {
        serverList.remove(server);
    }

    // 使用Random随机获取一个服务
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
