package cn.com.simpleFacotry02.factory;

import cn.com.simpleFacotry02.product.DatabaseLogger;
import cn.com.simpleFacotry02.product.Logger;

/**
 * 数据库日志记录器工厂类：具体工厂
 *
 * @author jiaql
 * @create 2017-04-25 14:41
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
