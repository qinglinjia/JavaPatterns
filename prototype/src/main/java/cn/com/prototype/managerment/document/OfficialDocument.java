package cn.com.prototype.managerment.document;

/**
 * //抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 *
 * @author jiaql
 * @create 2017-04-26 16:18
 */
public interface OfficialDocument extends Cloneable {

    OfficialDocument clone();

    void display();
}
