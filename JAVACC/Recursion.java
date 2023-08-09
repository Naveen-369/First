import java.util.Scanner;
public class Recursion {
    //Declaration of the Factoridal function recursively
    static int fact(int data){
        if(data==0)
            return 1;
        return data*fact(data-1);
    }
    //Declaration of the main funciton 
    public static void main(String[] args){
        int n;
        System.out.print("Enter the number to find the factorial : ");
        try(Scanner scanner =new Scanner(System.in)){
            n=scanner.nextInt();
        }
        System.out.println("The Factorail of "+n+" is "+fact(n));
        return;
    }
}
