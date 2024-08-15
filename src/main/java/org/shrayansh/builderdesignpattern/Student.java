package org.shrayansh.builderdesignpattern;

import java.util.List;

public class Student{
    int rollNumber; //mandatory field
    int age; //optional field
    String name; //optional field
    String fatherName;  //optional field
    String motherName;  //optional field
    List<String> subjects; //optional field
    String mobileNumber;  //optional field

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
        this.mobileNumber = studentBuilder.mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
