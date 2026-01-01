package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigMain {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class)) {
            Student ctor = ctx.getBean("studentConstructorBean", Student.class);
            Student setter = ctx.getBean("studentSetterBean", Student.class);

            System.out.println("Annotation Constructor Injection -> " + ctor);
            System.out.println("Annotation Setter Injection -> " + setter);
        }
    }
}
