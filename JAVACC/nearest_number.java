import java.util.Scanner;
public class nearest_number {
    public static void main(String srgs[]){
        int n;
        try(Scanner scanner=new Scanner(System.in)){
            System.out.print("Pls enter a valid number : ");
            n=scanner.nextInt();
        }
        while(n>0){
            if(n%10==0){
                System.out.print("The number that is near to the given number that is divisible by 10 is found to be \""+n+"\"");
                break;
            }
            n--;
        }
        return;
    }
}
