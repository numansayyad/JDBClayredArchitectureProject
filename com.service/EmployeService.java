import java.util.ArrayList;

public class EmployeService {
  // we need to write business logic in service class
  EmployeeDao dao = new EmployeeDao();

  public String saveEmployee(Employee employee) {
    String msg = dao.saveEmployee(employee);
    return msg;
  }

  public String updateEmployee(Employee employee) {
    String msg = dao.updateEmployee(employee);
    return msg;
  }

  public String getemployebyId(int id) {
    String msg = dao.getemployebyId(id);// getemployebyid() method return a string so i have stored in msg variable
    return msg;
  }

  public ArrayList<Employee> getAllEmployees() {
    ArrayList<Employee> employees = dao.getAllEmployees();

    return employees;
  }
public String delete(int id)
{
    String msg = dao.deleteById(id);

    if(msg == null){
      return "employee not found";
 }

    return msg;
}

}
