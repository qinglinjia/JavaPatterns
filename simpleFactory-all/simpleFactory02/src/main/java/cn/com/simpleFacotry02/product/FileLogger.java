package cn.com.simpleFacotry02.product;

/**
 * 文件日志记录器：具体产品
 *
 * @author jiaql
 * @create 2017-04-25 14:39
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}

