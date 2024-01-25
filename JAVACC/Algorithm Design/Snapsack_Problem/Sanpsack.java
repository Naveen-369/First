package Snapsack_Problem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Sanpsack{
        //Declaration of the items
    static class item{
        int Value,Weigth;
        public item(int Value,int Weight){
            this.Value=Value;
            this.Weigth=Weight;
        }
    }

    //Declaration of the function
    public static double HighPossibleSum(item[] arr,int cap){
        /*1.Override the sort Function
         *2.Declare the sum variable
         *3.iterate through each object
        */
        //Overriding the sort Function
        Arrays.sort(arr,new Comparator<item>(){
            @Override public int compare(item i1,item i2){
                double val1=(double)i1.Value/(double)i1.Weigth;
                double val2=(double)i2.Value/(double)i2.Weigth;
                if(val1<val2)
                    return 1;
                return -1;
            }
        });
        //Declaration
        double HighPossibleSum=0d;
        //Iterating through each objects
        for(item i1: arr){
            int Current_Value=(int)i1.Value;
            int Current_Weigth=(int)i1.Weigth;
            if(cap-Current_Weigth>=0){
                cap-=Current_Weigth;
                HighPossibleSum+=Current_Value;
            }
            else{
                double valuee=(double) cap/(double)Current_Weigth;
                HighPossibleSum+=Current_Value*valuee;
                cap-=(int)Current_Weigth*valuee;
                break;
            }
        }
        return HighPossibleSum;
    }
    //Declaration of the driver class
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  // ANSI escape codes to clear the screen
        System.out.flush();
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\tPROGRAM EXECUTION ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t-----------------");
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the bag : ");
        int capacity=scanner.nextInt();
        System.out.print("Enter the number of items : ");
        a = scanner.nextInt();
        item[] arr=new item[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the Properties of the item "+(i+1)+" :- ");
            System.out.print("Value : ");
            int value = scanner.nextInt();
            System.out.print("Weight : ");
            int weigth = scanner.nextInt();
            arr[i]=new item(value,weigth);
            System.out.println("-----------------------------------------------");
        }
        scanner.close();
        double d = HighPossibleSum(arr,capacity);
        System.out.println("\t\t\t\t\t\t\t\t\t*** -------------------------------------------------------------***");
        System.out.println("\t\t\t\t\t\t\t\t\t    |    The maximum profit with the capacity of "+capacity+" is : "+d+"    |");
        System.out.println("\t\t\t\t\t\t\t\t\t    -------------------------------------------------------------");
    }
}
