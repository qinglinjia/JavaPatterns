package cn.com.simpleFacotry02.client;

import cn.com.simpleFacotry02.factory.LoggerFactory;
import cn.com.simpleFacotry02.product.Logger;
import cn.com.simpleFacotry02.util.XMLUtil;

/**
 * 客户端测试
 *
 * @author jiaql
 * @create 2017-04-25 14:43
 */
public class Client {

    public static void main(String[] args) {

        LoggerFactory factory;
        Logger logger;
        //可引入配置文件实现
        factory = (LoggerFactory)XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
