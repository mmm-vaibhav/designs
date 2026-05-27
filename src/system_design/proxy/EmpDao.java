package system_design.proxy;

public interface EmpDao {

    public void createEmp(String client, EmpObj empObj) throws Exception;
    public void deleteEmp(String client, EmpObj empObj);
    public EmpObj getEmp(String client, EmpObj empObj);
}
