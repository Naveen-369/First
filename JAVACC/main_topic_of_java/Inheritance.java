package main_topic_of_java;
import java.util.ArrayList;
//Declaration of the Employee Class
class employee {
    //Data declaration
    private int emp_id;
    private String Employeee_name;
    private String Department;
    private double salary;
    //Methods Declaration
    employee(int emp_id, String Employeee_name,String Department, double salary){//Constructor
        this.emp_id = emp_id;
        this.Employeee_name = Employeee_name;
        this.salary = salary;
        this.Department= Department;
    }
    //Getter Methods
    double getsalary(){//salary
        return salary;
    }
    int getid(){
        return emp_id;
    }
    String getname(){
        return Employeee_name;
    }
    String getDepartment(){
        return Department;
    }
    //Method ot display all the data fields
    void Displaydata(){//Print all the details
        System.out.println("Employee ID : "+emp_id);
        System.out.println("Salary : "+salary);
        System.out.println("Employee Name : "+Employeee_name);
        System.out.println("Department : "+Department);
    }
}
//Declaration of the manager class which is a sub class
class Manager extends employee{
    //Data Declaaration
    double bonus;
    //Method Declarations
    Manager(int a,String b,String Dep,double sal,double bonus){//Constructor
        super(a,b,Dep,sal);
        this.bonus=bonus;
    }

    double getsalary(){//Finds the salary
        return super.getsalary()+bonus;
    }

    void GiveIncreament(float per){
        bonus = (getsalary()*per)/100;
    }
    void increament(int amt){
        bonus +=(float)amt;
    }

}

public class Inheritance {
    public static void main(String args[]){
        ArrayList<employee> employees=new ArrayList<employee>();//Dynamic Binding
        employees.add(0,new employee(131,"John","Manager",56000.00));
        employees.add(1,new employee(132,"Carl","Technical",50000.00));
        employees.add(2,new employee(133,"Kavin","Sales",45000.00));
        employee emp=new Manager(134,"Ezhilizabath","Memeber of Board of Director",50000.00,10000.50);
        employees.add(3,emp);
        for(employee e : employees){//e ->Polymorphism because ot can adapt and use the data and methods of both the super class and sub class
            System.out.println("Name : "+e.getname());
            System.out.println("Department : "+e.getDepartment());
            System.out.println("Employree ID : "+e.getid());
            System.out.println("Salary : "+e.getsalary());
            System.out.println("----------------------------------------------------------------");
        }
    }
}
