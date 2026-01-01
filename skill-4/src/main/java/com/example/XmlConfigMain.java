package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Student ctor = ctx.getBean("studentConstructor", Student.class);
            Student setter = ctx.getBean("studentSetter", Student.class);

            System.out.println("XML Constructor Injection -> " + ctor);
            System.out.println("XML Setter Injection -> " + setter);
        }
    }
}
