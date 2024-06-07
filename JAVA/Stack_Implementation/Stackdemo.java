package Stack_Implementation;
import java.util.Scanner;

public class Stackdemo{
    public static void main(String args[]){
        int ch,f;
        Stack s1=new Stack();
        try(Scanner scanner =new Scanner(System.in)){ 
            do{
                System.out.println("\n1->Push\n2->Pop\n3->Display\n4->Exit");
                System.out.print("Enter your purpose... : ");
                ch=scanner.nextInt();
                switch(ch){
                    case 1:
                        System.out.print("Enter the element to be inserted in the stack : ");
                        f=scanner.nextInt();
                        s1.push(f);
                        break;
                    case 2:
                        System.out.print(s1.pop());
                        break;
                    case 3:

                        s1.display();
                        break;
                    case 4:
                        System.out.println("The execution is successfull : ) ");
                        break;
                    default:
                        System.out.println("Pls enter a valid choice ! ! !");
                        break;
                }
            }while (ch!=4);
        }
        return;
    }
}
