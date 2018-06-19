package com.yunzh.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

//dubbo://192.168.199.156:20880/com.yunzh.dubbo.IUserService
public class Cluster2 {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/cluster1.xml");

        context.start();

        System.in.read();
    }
}
