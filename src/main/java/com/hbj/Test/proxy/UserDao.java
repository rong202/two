package com.hbj.Test.proxy;

public class UserDao implements IUserDao{

    @Override
    public void a() {
        System.out.println("aaa");
    }

    @Override
    public void b() {
        System.out.println("bbb");
    }
}
