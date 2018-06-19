package com.yunzh.dubbo;

public class UserServiceImpl1 implements IUserService {

    @Override
    public String helloUser(String username) {
        return "hello i'm 2 : " + username;
    }
}
