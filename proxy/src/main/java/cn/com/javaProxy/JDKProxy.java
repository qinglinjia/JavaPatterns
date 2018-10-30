package cn.com.javaProxy;


import cn.com.Dao.Customer;
import cn.com.DaoImpl.CustomerImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于java的动态代理
 *
 * @author jiaql
 * @create 2017-04-22 11:14
 */
public class JDKProxy {
    // 代理目标
    private Object targetObject;

    public Object proxy(Object obj) {
        targetObject = obj;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), new TargetHandler());
    }

    class TargetHandler implements InvocationHandler {

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 添加业务处理前的处理
            dealStart();
            // 回调被代理目标的方法
            Object returnValue = null;
            try {
                returnValue = method.invoke(targetObject, args);
            } catch (IllegalAccessException e) {
               System.out.println("异常");
            } catch (IllegalArgumentException e) {
                System.out.println("异常");
            } catch (InvocationTargetException e) {
                System.out.println("异常");
            }
            // 添加业务处理后的处理
            dealEnd();
            return returnValue;
        }

        private void dealStart() {
            StringBuffer sb = new StringBuffer("开始购物前处理。。。");
            sb.append("开始学习java第一章");

            sb.append("hello word 开始。。。。。");

            sb.append("java第一章学习结束");

            System.out.println(sb.toString());
        }

        private void dealEnd() {
            StringBuffer sb = new StringBuffer("购物结束后的处理。。。");
            sb.append("练习学习过的java第一章");

            sb.append("上次学的是hello word");

            sb.append("java练习结束");

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        JDKProxy jdkProxy = new JDKProxy();
        Customer userDao = (Customer) jdkProxy.proxy(new CustomerImpl());
        userDao.walk("阿拉斯加");

    }
}
