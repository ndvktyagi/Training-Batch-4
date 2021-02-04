package entityBeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @Column(name = "EMP_ID")
    private long empId;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "EMP_MOBILE")
    private long empMobile;

    @Column(name = "EMP_EMAIL")
    private String empEmail;

    @Column(name = "EMP_DEPT")
    private int empDepart;

    @Column(name = "EMP_SALARY")
    private float empSalary;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(long empMobile) {
        this.empMobile = empMobile;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getEmpDepart() {
        return empDepart;
    }

    public void setEmpDepart(int empDepart) {
        this.empDepart = empDepart;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }
}

