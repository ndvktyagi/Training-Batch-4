package service;

import beans.Employee;

import java.lang.reflect.InvocationTargetException;

public interface EmployeeService {

    public Employee empGet(Long emp) throws InvocationTargetException, IllegalAccessException;

    public Long empSave(Employee emp) throws InvocationTargetException, IllegalAccessException;

    public int empUpdate(Employee emp);

    public int empDelete(Employee emp);

}
