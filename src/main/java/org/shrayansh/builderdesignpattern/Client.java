package org.shrayansh.builderdesignpattern;

public class Client {
    public static void main(String[] args) {
        Director director1=new Director(new MBAStudentBuilder());
        Student mbaStudent = director1.createStudent();
        System.out.println(mbaStudent.toString());


        Director director2=new Director(new EngineeringStudentBuilder());
        Student engineeringStudent = director2.createStudent();
        System.out.println(engineeringStudent.toString());

    }
}
