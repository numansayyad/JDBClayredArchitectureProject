public class EmployeService {
    
        EmployeeDao dao = new EmployeeDao();

        public String saveEmployee(Employee employee){
          String msg=  dao.saveEmployee(employee);
          return msg;}
    
      public String updateEmployee(Employee employee){
        String msg = dao.updateEmployee(employee);
        return msg;
    }
    public String getemployebyId(int id){
      String msg = dao.getemployebyId(id);
         return msg;
    }
    
}
