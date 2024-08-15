package org.shrayansh.prototypedesignpattern;

public class Student implements Prototype {
    String name;
    private int rollNo;
    int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Student(name,rollNo,age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }
}
