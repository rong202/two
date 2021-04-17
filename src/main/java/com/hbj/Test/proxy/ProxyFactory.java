package com.hbj.Test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * 创建动态代理
 * 动态代理不需要实现接口，但需要制定接口类型
 */

/**
 * jdk 动态代理有一个限制，就是代理对象必须实现一个或多个接口 也叫 接口代理
 * 如果想实现没有接口的类，就可以使用cglib 代理（子类代理）
 */
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标对象接口类型，使用泛型方式确认
                target.getClass().getInterfaces(),
                //触发事件处理器的方法，会把当前执行目标的对象的方法作为参数传入
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        Object returnValue = method.invoke(target,args);
                        System.out.println("提交事务2");

                        return returnValue;
                    }
                }
        );
    }
}
