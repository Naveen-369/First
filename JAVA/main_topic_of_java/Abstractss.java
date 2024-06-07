package main_topic_of_java;
//Declaration of the Abstract class
abstract class members{
    private int id;
    private String name;
    //Member function declaration
    members(){
        id=-1;
        name="NULL";
    }
    members(int id, String name){
        this.id=id;
        this.name=name;
    }
    //Getter function declaration
    int getid(){
        return id;
    }
    String getname(){
        return name;
    }
    //Definition of abstraction
    abstract void Welcome(String name);
}
//Declaration of the Student Class
class student extends members{
    student(int a,String b){
        super(a,b);
    }
    void Welcome(String name){
        System.out.println("Hello Student ..."+name);
    }   
}
//Declarationof the Teacher Classs
class teacher extends members{
    teacher(int a,String s){
        super(a, s);
    }
    void Welcome(String name){
        System.out.println("Hello teacher ..."+name);    
    }
}
//Declaration of Main Class
public class Abstractss {
   public static void main(String[] args){
        System.out.println("Execution of the program starts over here....");
        student stu=new student(123,"Naveen Kumar");
        teacher Teacher = new teacher(147,"Babu Das");
        members m[]=new members[2];
        m[0]=stu;
        m[1]=Teacher;
        System.out.println("Student Info ");
        System.out.println("------------------------------------");
        System.out.println("The student name is found to be :"+m[0].getname());
        System.out.println("The Identification number is : "+m[0].getid());
        System.out.println("------------------------------------");
        System.out.println("Teacher Info : ");
        System.out.println("-------------------------------------");
        System.out.println("The name of the teacher is found to be : "+m[1].getname());
        System.out.println("The Idetification number of the teacher is found to be : "+m[1].getid());
        System.out.println("--------------------------------------");
        return;
        

   }
}
