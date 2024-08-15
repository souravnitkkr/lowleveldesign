package org.shrayansh.iteratordesignpattern.company;

import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeIterator implements Iterator {
    private List<Employee> listEmployee;
    private int current_pos=0;

    public EmployeeIterator(List<Employee> listEmployee){
        this.listEmployee=listEmployee;
    }

    @Override
    public boolean hasNext() {
        return (current_pos<listEmployee.size());
    }

    @Override
    public Employee next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return listEmployee.get(current_pos++);
    }
}
