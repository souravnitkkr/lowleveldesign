package org.shrayansh.proxydesignpattern;

public interface EmployeeDao {
    void createEmployee(String client,Employee obj) throws Exception;
    void deleteEmployee(String client,int empId) throws Exception;
    Employee getEmployee(String client,int empId) throws Exception;
}
