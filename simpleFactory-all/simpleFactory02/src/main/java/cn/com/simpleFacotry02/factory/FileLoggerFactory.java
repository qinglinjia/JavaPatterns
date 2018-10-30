package cn.com.simpleFacotry02.factory;

import cn.com.simpleFacotry02.product.FileLogger;
import cn.com.simpleFacotry02.product.Logger;

/**
 * 文件日志记录器工厂类：具体工厂
 *
 * @author jiaql
 * @create 2017-04-25 14:41
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
