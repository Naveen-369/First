/*define a class called student.Add relavent data like name, roll no., marks in an array define marks total method and create 
different object  for atleaast three student and finc the average and the total for their respective classes.
 */
import java.util.Scanner;
class Student{
    String name;
    String roll_no;
    int marks[]=new int[7];
    //Declaration of total function
    int total(){
        int ans=0;
        for(int i : marks){
            ans+=i;
        }
        return ans;
    }
    //Declaration of the average function
    float average(){
        return total()/7;
    }
    float ling(){
        float ans=0;
        for(int i=0;i<4;i++){
            ans+=marks[i];
        }
        ans=ans/400;
        ans*=100;
        return ans;
    }
    float tech(){
        float ans =0;
        for(int i=4;i<=6;i++){
            ans+=marks[i];
        }
        ans=ans/300;
        ans*=100;
        return ans;
    }
}
public class practice {
    public static void main(String args[]){
        Student stu=new Student();
        try(Scanner scanner=new Scanner(System.in)){
            System.out.print("Enter the roll number of the student : ");
            stu.roll_no=scanner.nextLine();
            System.out.print("Enter the Name of the Student : ");
            stu.name=scanner.nextLine();
            System.out.println("Enter the Marks : ");
            String namess[]={"Tamil","English","French","German","Mathematics","Science","Digital System Design"};
            for(int i=0;i<7;i++){
                System.out.print(namess[i]+" Marks = ");
                stu.marks[i]=scanner.nextInt();
            }
        }
        System.out.println("\n------------ STUDENT INFO ------------");
        System.out.println("Roll Number : "+stu.roll_no+"\t||\tName : "+stu.name+"\nTotal marks ="+stu.total()+"/700\t||\tThe average ="+stu.average()+"%");
        System.out.println("\nExcellency\n----------");
        System.out.println("Linguistic : "+stu.ling()+"%\nTechnical : "+stu.tech()+"%");
        return;
    }
}
