package org.shrayansh.proxydesignpattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void createEmployee(String client, Employee obj) throws Exception {
        System.out.println("Created a new row in Employee table");
    }

    @Override
    public void deleteEmployee(String client, int empId) throws Exception {
        System.out.println("Deleted a row in the Employee table for empId = "+empId);
    }

    @Override
    public Employee getEmployee(String client, int empId) throws Exception {
        System.out.println("Fetching data from DB for empId = "+empId);
        return new Employee();
    }
}
