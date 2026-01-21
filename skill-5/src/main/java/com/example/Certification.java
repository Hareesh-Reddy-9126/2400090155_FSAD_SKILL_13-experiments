package com.example;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 501;
    private String name = "Spring Professional";
    private String dateOfCompletion = "10-01-2026";

    @Override
    public String toString() {
        return "Certification{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfCompletion='" + dateOfCompletion + '\'' +
                '}';
    }
}
