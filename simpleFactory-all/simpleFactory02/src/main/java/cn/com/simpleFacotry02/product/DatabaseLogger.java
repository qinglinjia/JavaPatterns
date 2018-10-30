package cn.com.simpleFacotry02.product;

/**
 * 数据库日志记录器：具体产品
 *
 * @author jiaql
 * @create 2017-04-25 14:38
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
