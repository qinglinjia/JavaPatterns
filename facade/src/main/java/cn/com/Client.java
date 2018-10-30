package cn.com;

/**
 * @author jiaql
 * @create 2017-05-04 16:01
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
