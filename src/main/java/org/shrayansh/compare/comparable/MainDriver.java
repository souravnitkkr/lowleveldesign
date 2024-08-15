package org.shrayansh.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(10,"Sourav",24));
        studentList.add(new Student(11,"Ashish",25));
        studentList.add(new Student(12,"Rajat",12));
        Collections.sort(studentList);

        System.out.println(studentList);
    }
}
