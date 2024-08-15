package org.shrayansh.compare.comparable;

public class Student implements Comparable<Student>{
    int marks;
    String name;
    int rollNo;

    public Student(int marks, String name, int rollNo) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo-o.rollNo;
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
