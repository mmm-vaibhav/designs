package system_design.proxy;

public class EmpDaoProxy implements EmpDao {

    private EmpDaoImpl empDaoImpl;


    public EmpDaoProxy() {
        empDaoImpl = new EmpDaoImpl();
    }

    @Override
    public void createEmp(String client, EmpObj empObj) throws Exception {
        if(client.equals("ADMIN")) {
            empDaoImpl.createEmp(null, empObj);
        }
        throw new Exception("Access Denied!");
    }

    @Override
    public void deleteEmp(String client, EmpObj empObj) {

    }

    @Override
    public EmpObj getEmp(String client, EmpObj empObj) {
        return null;
    }
}
