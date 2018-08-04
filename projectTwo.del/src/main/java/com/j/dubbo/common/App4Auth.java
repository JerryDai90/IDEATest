package com.j.dubbo.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by jerry on 3/11/18.
 */
public class App4Auth {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }

}
