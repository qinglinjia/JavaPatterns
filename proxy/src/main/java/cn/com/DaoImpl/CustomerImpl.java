package cn.com.DaoImpl;


import cn.com.Dao.Customer;

/**
 * @author jiaql
 * @create 2017-04-22 11:39
 */
public class CustomerImpl implements Customer {
    public void shopping() {
        System.out.println("客户正在购物.....");
       int i = 3/0;
    }

    public void walk(String dogName) {
        System.out.println("客户正在带着小狗" + dogName + "散步中。。。。");
        shopping();
    }
}
