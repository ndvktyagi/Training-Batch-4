package beans;

public class Employee {

    private long empId;
    private String empName;
    private long empMobile;
    private String empEmail;
    private int empDepart;
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
