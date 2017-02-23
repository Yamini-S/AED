/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Address.Address;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name , String street, String city,
            String state, String zip){
        Employee employee = new Employee();
        employee.setName(name);
        Address add = new Address();
        add.setStreet(street);
        add.setCity(city);
        add.setState(state);
        add.setZipCode(zip);
        employee.setAddress(add);
        employeeList.add(employee);
        return employee;
    }
    
     public Employee searchEmp(int id) {
        for (Employee employee : employeeList) {
            if (employee.getPersonId() == id) {
                return employee;
            }
        }
        return null;
    }
    
}
