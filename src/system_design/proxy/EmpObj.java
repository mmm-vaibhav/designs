package system_design.proxy;

public class EmpObj {

    private int  empId;
    private String empName;
    private double empSalary;

    public EmpObj() {

    }

    public EmpObj(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "EmpObj{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
