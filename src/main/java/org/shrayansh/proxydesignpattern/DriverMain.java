package org.shrayansh.proxydesignpattern;

public class DriverMain {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy=new EmployeeDaoProxy();
        try {
            employeeDaoProxy.createEmployee("USER",new Employee());
            System.out.println("Operation successful!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
