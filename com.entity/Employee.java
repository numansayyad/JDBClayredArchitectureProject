public class Employee {

    private int id;
    private String name;
    private double salary;
    private String dep;
    private String gender;

    public void setinfo(int id,String name,double salary,String dep,String gender ){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dep=dep;
        this.gender=gender;
    }

    int getid(){
        return id;
    }
    String getname(){
        return name;
    }
    double getsalary(){
        return salary;
    }
    String getdep(){
        return dep;
    }
    String getgender(){
        return gender;
    }


//  public static void main(String[] args) {
    
//  }   
}
