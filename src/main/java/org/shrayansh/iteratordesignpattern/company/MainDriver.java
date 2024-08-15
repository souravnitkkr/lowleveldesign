package org.shrayansh.iteratordesignpattern.company;

import java.util.ArrayList;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Rajesh",1000));
        employeeList.add(new Employee("Mukesh",2000));
        employeeList.add(new Employee("Gopal",3000));

        Company company=new Company(employeeList);

        Iterator employeeIterator= company.createIterator();

        while (employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

    }
}
