package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    // Constructor injection example
    @Bean
    public Student studentConstructorBean() {
        return new Student(201, "Charlie", "Spring Core", "2026");
    }

    // Setter injection example
    @Bean
    public Student studentSetterBean() {
        Student s = new Student(202, "Dana", "Placeholder", "Placeholder");
        s.setCourse("Microservices");
        s.setYear("2027");
        return s;
    }
}
