import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        // Employee s3 = new Employee();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Save Employee ");
            System.out.println("2.Update Employee ");
            System.out.println("3 Find Employees ByID ");
            System.out.println("4.All Employess ");
            System.out.println("5.Delete Employee ByID ");
            System.out.println("6.Get Only Male Employees ");
            System.out.println("7.Get Only Female Employees ");
            System.out.println("8.Delete All Employees ");
            System.out.println("9.Exit ");

            System.out.println("Enter your choice :");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter ID :");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Name :");
                String name = sc.nextLine();
                // sc.nextLine();
                System.out.println("Enter Salary :");
                double salary = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter Gender :");
                String gender = sc.nextLine();
                // sc.nextLine();
                System.out.println("Enter Dep :");
                String dep = sc.nextLine();

                Employee emp = new Employee();
                emp.setinfo(id, name, salary, gender, dep);
                String msg = controller.saveEmployee(emp);
                System.out.println(msg);

            }

            else if (choice == 2) {

                System.out.println("Enter ID : ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Name : ");
                String name = sc.nextLine();
                // sc.nextLine();
                System.out.println("Enter Salary : ");
                double salary = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter Gender :");
                String gender = sc.nextLine();
                // sc.nextLine();
                System.out.println("Enter Dep : ");
                String dep = sc.nextLine();

                Employee emp = new Employee();
                emp.setinfo(id, name, salary, gender, dep);
                String msg = controller.updateEmployee(emp);
                System.out.println(msg);
            }

            else if (choice == 3) {
                System.out.println("Enter the Employee ID :");
                int id = sc.nextInt();
                String msg = controller.getemployebyId(id);
                System.out.println(msg);

            }

            else if (choice == 4) {
                ArrayList<Employee> employees = controller.getAllEmployees();
                if (employees.isEmpty()) {
                    System.out.println("employess is a not present in the list !. ");
                } else {
                    for (Employee employee : employees) {
                        System.out.println("ID      :" + employee.getid());
                        System.out.println("Name    :" + employee.getname());
                        System.out.println("Dep     :" + employee.getdep());
                        System.out.println("Gender  :" + employee.getgender());
                        System.out.println("Salary  :" + employee.getsalary());

                        System.out.println("----------------------------------");
                    }
                }
            } else if (choice == 5) {
                System.out.println("Enter Id to delete Employee");
                int id = sc.nextInt();
                String msg = controller.delete(id);
                System.out.println(msg);
            }

            else if (choice == 6) {
                System.out.println("Male Employees:");

                ArrayList<Employee> allemp = controller.displayMale();
                for (Employee emp : allemp) {
                    System.out.println("ID: " + emp.getid());
                    System.out.println("Name: " + emp.getname());
                    System.out.println("Dep: " + emp.getdep());
                    System.out.println("Gender: " + emp.getgender());
                    System.out.println("Salary: " + emp.getsalary());
                    System.out.println("----------------------");
                }
            }

            else if (choice == 7) {
                System.out.println("Female Employees:");

                ArrayList<Employee> allemp = controller.displayFemale();
                for (Employee emp : allemp) {
                    System.out.println("ID: " + emp.getid());
                    System.out.println("Name: " + emp.getname());
                    System.out.println("Dep: " + emp.getdep());
                    System.out.println("Gender: " + emp.getgender());
                    System.out.println("Salary: " + emp.getsalary());
                    System.out.println("----------------------");
                }
            } else if (choice == 8) {
                String msg = controller.deleteemp();
                System.out.println(msg);
            }

            else if (choice == 9) {
                System.out.println("thank you");
                break;
            }

            else {
                System.out.println("invalid choice");
            }

        }

        // s3.setinfo(1, "viraj", 99, "Bca", "male");

        // // String msg= controller.saveEmployee(s3);
        // // System.out.println(msg);

        // String msg =controller.updateEmployee(s3);
        // System.out.println(msg);
    }
}
