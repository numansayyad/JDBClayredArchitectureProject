import java.util.ArrayList;

public class EmployeeController {
    EmployeService service = new EmployeService();

    public String saveEmployee(Employee employee) {
        String msg = service.saveEmployee(employee);
        return msg;
    }

    public String updateEmployee(Employee employee) {
        String msg = service.updateEmployee(employee);
        return msg;
    }

    public String getemployebyId(int id) {
        String msg = service.getemployebyId(id);
        return msg;
    }

    public ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> employees = service.getAllEmployees();

        return employees;
    }

    public String delete(int id) {
        String msg = service.delete(id);

        return msg;
    }

    public String deleteemp() {
        String msg = service.deleteemp();
        return msg;
    }

    public ArrayList<Employee> displayMale() {
        ArrayList<Employee> employees = service.displayMale();
        return employees;
    }
    public  ArrayList<Employee> displayFemale(){
 ArrayList<Employee> employees=  service.displayFemale();
 return employees;
}

}
