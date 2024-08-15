package org.shrayansh.proxydesignpattern;

public class EmployeeDaoProxy implements EmployeeDao{

    private EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy(){
        employeeDao=new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String client, Employee obj) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.createEmployee(client,obj);
            return;
        }
        throw new Exception("ACCESS DENIED!");
    }

    @Override
    public void deleteEmployee(String client, int empId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.deleteEmployee(client, empId);
            return;
        }
        throw new Exception("ACCESS DENIED!");
    }

    @Override
    public Employee getEmployee(String client, int empId) throws Exception {
        if(client.equals("USER") || client.equals("ADMIN")){
            return employeeDao.getEmployee(client, empId);
        }
        throw new Exception("ACCESS DENIED!");
    }
}
