package org.shrayansh.prototypedesignpattern;

public class Client {
    public static void main(String[] args) {
        Student obj=new Student("Ram",34,14);
        System.out.println("Original object = " +obj);
        Student clonedObj= (Student) obj.clone();
        System.out.println("Cloned object = "+clonedObj);

    }
}
