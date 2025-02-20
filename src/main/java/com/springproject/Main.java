package com.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springproject");
        FirstBean firstBean = context.getBean(FirstBean.class);
        SecondBean secondBean = context.getBean(SecondBean.class);
        System.out.println(firstBean.sayHello());
        System.out.println(secondBean.userName());
    }
}