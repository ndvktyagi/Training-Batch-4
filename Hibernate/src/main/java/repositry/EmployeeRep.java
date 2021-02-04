package repositry;

import entityBeans.EmployeeEntity;

public interface EmployeeRep {
    public EmployeeEntity empGet(Long emp);
    public Long empSave(EmployeeEntity emp);
    public int empUpdate(EmployeeEntity emp);
    public int empDelete(EmployeeEntity emp);
}
