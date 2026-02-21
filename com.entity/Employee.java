public class Employee {

    private int id;
    private String name;
    private double salary;
        private String gender;

    private String dep;

    public void setinfo(int id,String name,double salary,String gender,String dep ){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.gender=gender;
            this.dep=dep;

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
    String getgender(){
        return gender;
    }
    String getdep(){
        return dep;
    }
    


//  public static void main(String[] args) {
    
//  }   
}
