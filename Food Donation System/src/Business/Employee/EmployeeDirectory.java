/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author aawad
 */
public class EmployeeDirectory {
    private ArrayList<Employee> listEmployee;
    
    public EmployeeDirectory(){
    this.listEmployee =new ArrayList();
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        listEmployee.add(employee);
        return employee;
    }
}
