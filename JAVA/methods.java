import java.util.Scanner;
public class methods {
    private static int calcvolume(int length,int breath,int depth){
        return length*breath*depth;
    }
    private static int perimeter(int length,int breath,int depth){
        return length+breath+depth;
    }
    private static int area(int length,int breath){
        return length*breath;
    }
    public static void main(String args[]){
        int a,b,c;
        try(Scanner scanner=new Scanner(System.in)){
            System.out.print("Ente rhe Length : ");
            a=scanner.nextInt();
            System.out.print("Enter the Breath :");
            b=scanner.nextInt();
            System.out.print("Enter the Depth :");
            c=scanner.nextInt();
        }
        System.out.println("Volume : "+calcvolume(a,b,c)+" Cubic Units");
        System.out.println("Area : "+area(a,b)+" Square Units");
        System.out.println("Perimenter : "+perimeter(a,b,c)+" Units");
        return;
    }
}
