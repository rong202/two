package com.hbj.Test.proxy;

public class TestProxy {
    public static void main(String[] args) {

        UserDao target = new UserDao();
        //原始的类型
        System.out.println(target.getClass());
        ProxyFactory proxyFactory = new ProxyFactory(target);
        //必须指定接口类型，否则
        //Exception in thread "main" java.lang.ClassCastException: com.sun.proxy.$Proxy0 cannot be cast to com.hbj.Test.proxy.UserDao
        //	at com.hbj.Test.proxy.TestProxy.main(TestProxy.java:11)
        IUserDao proxyInstance = (IUserDao) proxyFactory.getProxyInstance();
        System.out.println(proxyFactory.getClass());
        proxyInstance.a();


    }

}
