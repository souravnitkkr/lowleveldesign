package org.shrayansh.iteratordesignpattern.company;


import java.util.List;

public class Company implements Aggregate {

    private List<Employee> employeeList;

    public Company(List<Employee> employeeList){
        this.employeeList=employeeList;
    }

    @Override
    public Iterator createIterator() {
        return new EmployeeIterator(employeeList);
    }
}
