package com.example;

public class Student {
    private int studentId;
    private String name;
    private String course;
    private String year;

    // Constructor injection for all fields
    public Student(int studentId, String name, String course, String year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Setters for two fields (can be used in setter injection demo)
    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
