package com.crz.dao;

public class UserDaoImplMysql implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取数据");
    }
}
