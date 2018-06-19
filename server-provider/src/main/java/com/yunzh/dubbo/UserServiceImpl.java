package com.yunzh.dubbo;

public class UserServiceImpl implements IUserService {

    @Override
    public String helloUser(String username) {
        return "hello : " + username;
    }
}
