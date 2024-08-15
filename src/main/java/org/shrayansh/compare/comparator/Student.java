package org.shrayansh.compare.comparator;

public class Student {
    int marks;
    String name;
    int rollNo;

    public Student(int marks, String name, int rollNo) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
