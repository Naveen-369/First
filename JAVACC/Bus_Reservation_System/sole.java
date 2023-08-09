package Bus_Reservation_System;
import java.util.Scanner;
import java.util.ArrayList;
public class sole {
    public static void main(String args[]){
        ArrayList<bus> buslist=new ArrayList<bus>();
        buslist.add(0,new bus(56, "Naveen", "Tiruppur", "Kovai", true, 56) );
        int ch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the Bus Reservation System");
        do{    
            System.out.println("1->Book a Seat \n2->Exit the Application");
            System.out.print("Enter your desired Task to be carried out : ");
            ch=scanner.nextInt();
            if(ch==1){
                System.out.println("Booking....");
            }
            else if(ch==2)
                System.out.println("Thank you ! Happy Journey ! ! ! ");
            else
                System.out.println("Enter a valid Choice ! ! ! ");
        }while(ch!=2);
        scanner.close();
    }
}
