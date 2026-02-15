
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// //dao file is a conatin only database related logic
// dao stand for database access object

public class EmployeeDao {

    Connection con = JDBCUtil.jdbcConnection();

    // create a method to insert data in DB table

    public String saveEmployee(Employee employee) {
        try {
            PreparedStatement pst = con.prepareStatement("insert into employees values(?,?,?,?,?) ");// query parameter
            pst.setInt(1, employee.getid());
            pst.setString(2, employee.getname());
            pst.setDouble(3, employee.getsalary());
            pst.setString(4, employee.getdep());
            pst.setString(5, employee.getgender());

            pst.execute();// to insert data
            // System.out.println("connecttion succssfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Emp Ragister sccseccfully";
    }

    // update data

    // dao method call -> service -> controller -> main.
    public String updateEmployee(Employee employee) {
        try {
            PreparedStatement upda = con.prepareStatement("update employees set ename= ?,salary =? where id=?");
            upda.setString(1, employee.getname());
            upda.setDouble(2, employee.getsalary());
            upda.setInt(3, employee.getid());
            upda.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "employee updated successfully";

    }

    // public String updateEmployee(Employee employee){
    // try{
    // PreparedStatement upda = con.prepareStatement(
    // "update employees set ename=?, salary=? where id=?"
    // );

    // upda.setString(1, employee.getname());
    // upda.setDouble(2, employee.getsalary());
    // upda.setInt(3, employee.getid());

    // upda.executeUpdate();
    // }
    // catch(Exception e){
    // e.printStackTrace();
    // }
    // return "employee updated successfully";
    // }

    // public static void main(String[] args) {

    // Employee data = new Employee();
    // data.setinfo(1, "numan", 99999, "Bca", "male");
    // EmployeeDao s1 = new EmployeeDao();
    // s1.saveEmployee(data);
    // }

    // get employe from Database by id
    public String getemployebyId(int id) {
        try {
            PreparedStatement stm = con.prepareStatement("select * from employees where id=?");
            stm.setInt(1, id);

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {// next() return type is boolean
                return "ID: " + rs.getInt("id") +
                        " | Name: " + rs.getString("ename") +
                        " | Salary: " + rs.getDouble("salary") +
                        " | Department: " + rs.getString("dep") +
                        " | Gender: " + rs.getString("gender");
            } else {
                return "Employee not found";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Find employe by id";
    }

    // get all employee from the database

    public ArrayList<Employee> getAllEmployees()// whatever you return the type of that value becomes your return type
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        try {
            PreparedStatement pst = con.prepareStatement("select * from employees");

            ResultSet rs = pst.executeQuery();

            // 6 times while loop will iterate
            while (rs.next()) {
                // 3 employee
                int id = rs.getInt("id");
                String name = rs.getString("ename");
                double salary = rs.getDouble("salary");
                String gender = rs.getString("gender");
                String dep = rs.getString("dep");

                Employee employee = new Employee();
                employee.setinfo(id, name, salary,  gender,dep);

                employees.add(employee);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return employees;

    }
//deleteEmployeeById

public String deleteById(int id)
{
    try {
        PreparedStatement pst = con.prepareStatement("delete from employees where id=?");
        pst.setInt(1, id);

       //return 1-if emp will deleted
       //return 0 - if emp will not deleted

       int  value =pst.executeUpdate();
       if(value>0)//0 means false ahe because  int return type return 0 for false and true for 1
       {
        return"employee deleted successfully";
       }
       else
       {
        return null;
       }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return null;

}

}