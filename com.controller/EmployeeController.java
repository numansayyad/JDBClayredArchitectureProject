public class EmployeeController {
    EmployeService service = new EmployeService();
    public String saveEmployee(Employee employee){
        String msg=service.saveEmployee(employee);
        return msg;
    }

    public String updateEmployee(Employee employee){
       String msg= service.updateEmployee(employee);
       return msg;
    }
    public String getemployebyId(int id){
       String msg =service.getemployebyId(id);
       return msg;
    }
}
