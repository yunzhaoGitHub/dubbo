package com.yunzh.dubbo;

/**
 * dubbo启动方式，无需容器
 */
public class Main {

    public static void main(String[] args) {

        // 默认情况下会使用spring容器启用
        com.alibaba.dubbo.container.Main.main(new String[]{"spring", "log4j"});
    }
}
