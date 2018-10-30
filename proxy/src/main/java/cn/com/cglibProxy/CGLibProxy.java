package cn.com.cglibProxy;

import cn.com.DaoImpl.CustomerImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 基于CGLIB动态代理
 *
 * @author jiaql
 * @create 2017-04-22 11:15
 */
public class CGLibProxy {
    private Object targetObject;

    private Object createProxy(Object obj) {
        targetObject = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(new MyHandler());
        return enhancer.create();
    }

    class MyHandler implements MethodInterceptor {
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("开始处理。。。");
            Object returnValue = method.invoke(targetObject, objects);
            System.out.println("结束处理。。。");
            return returnValue;
        }
    }

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        CustomerImpl customerImpl = (CustomerImpl) cgLibProxy.createProxy(new CustomerImpl());
        customerImpl.shopping();
    }

}
