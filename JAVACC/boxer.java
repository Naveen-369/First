
import java.util.Scanner;
class box{
    int length;
    int width;
    int height;
    int cal_area(){
        return length*width;
    }
    int cal_vol(){
        return length*height*width;
    }
    //Declaration of the methods that return the object
    box doubler(){
        box temp=new box();
        temp.height=2*this.height;
        temp.width=2*this.width;
        temp.length=2*this.length;
        return temp;
    }

}
public class boxer {
    public static void main(String args[]){
        box blackbox=new box();
        int a,b,c;
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter the Data of the box that is the lenght, Height and the widht of the box : ");
            System.out.print("i)Length = ");
            a=scanner.nextInt();
            System.out.print("ii)Width = ");
            b=scanner.nextInt();
            System.out.print("iii)Height = ");
            c=scanner.nextInt();
        }
        blackbox.width=b;
        blackbox.length=a;
        blackbox.height=c;
        System.out.println("THe area Occupaied : "+ blackbox.cal_area()+" Square Units");
        System.out.println("The volume of the blackcox : "+blackbox.cal_vol()+" Cubic Units");
        box dumybox=new box();
        dumybox=blackbox.doubler();
        System.out.println(dumybox.length);
        System.out.println(dumybox.height);
        return;
    }
}
