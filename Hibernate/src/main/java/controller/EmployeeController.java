package controller;

import beans.Employee;
import service.EmployeeService;
import serviceImpl.EmployeeServiceImpl;

import java.lang.reflect.InvocationTargetException;

public class EmployeeController {

    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException {
        EmployeeService employeeService = new EmployeeServiceImpl();
        /*Employee employee = new Employee();
        employee.setEmpId(101);
        employee.setEmpName("Suryansh Tyagi");
        employee.setEmpMobile(9910455253L);
        employee.setEmpEmail("suryansh@gmail.com");
        employee.setEmpDepart(1);
        employee.setEmpSalary(25000);
        Long result = employeeService.empSave(employee);
        if (result > 0) {
            System.out.println("Data has been saved successfully!");
        } else {
            System.out.println("Data has not saved successfully!");
        }*/

        Employee employee = employeeService.empGet(1002L);
        System.out.println(employee.getEmpId()+","+employee.getEmpName()+","+employee.getEmpMobile());
    }


}
