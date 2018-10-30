package cn.com;

import cn.com.api.ServiceA;
import cn.com.api.ServiceB;
import cn.com.api.ServiceC;
import cn.com.impl.ServiceAImpl;
import cn.com.impl.ServiceBImpl;
import cn.com.impl.ServiceCImpl;

/**
 * 外观模式
 *
 * @author jiaql
 * @create 2017-05-04 15:51
 */
public class Facade {

    private ServiceA serviceA;

    private ServiceB serviceB;

    private ServiceC serviceC;

    public Facade(){
        serviceA = new ServiceAImpl();
        serviceB = new ServiceBImpl();
        serviceC = new ServiceCImpl();
    }

    public void methodA() {
        serviceA.MethodA();
        serviceB.MethodB();
    }

    public void methodB() {
        serviceB.MethodB();
        serviceC.MethodC();
    }

    public void methodC() {
        serviceA.MethodA();
        serviceC.MethodC();
    }


}
