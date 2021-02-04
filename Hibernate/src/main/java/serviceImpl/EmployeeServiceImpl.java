package serviceImpl;

import beans.Employee;
import entityBeans.EmployeeEntity;
import repositry.EmployeeRep;
import repositryImpl.EmployeeRepImpl;
import service.EmployeeService;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRep employeeRep = new EmployeeRepImpl();

    @Override
    public Employee empGet(Long emp) throws InvocationTargetException, IllegalAccessException {
        Employee employee = new Employee();
        EmployeeEntity employeeEntity = employeeRep.empGet(emp);
        if (employeeEntity != null)
            BeanUtils.copyProperties(employee, employeeEntity);
        return employee;
    }

    @Override
    public Long empSave(Employee emp) throws InvocationTargetException, IllegalAccessException {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employeeEntity, emp);
        Long result = employeeRep.empSave(employeeEntity);
        return result;
    }

    @Override
    public int empUpdate(Employee emp) {
        return 0;
    }

    @Override
    public int empDelete(Employee emp) {
        return 0;
    }
}
