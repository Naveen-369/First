package LongestCommonSubSequence;
import java.util.Scanner;
/**
 * Concept Declaration
 * Declare a function that takes two strings as parameters
 * It must create a 2D ra using that string
 * If the two characters in the row and column matches, 
 * it must get the diagonal element and add 1 to it or else it must take the maximum of the left or upper element
 * At last, it must return the last value to the user
 */

public class LCSCalculate {
    //Delaration of the function
    public static int CalculateLCS(String str1,String str2){
        int num1=str1.length();
        int num2=str2.length();
        //Creation of 2-D Array
        int[][] newArr=new int[num1+1][num2+1];
        for(int i=0;i<num1;i++)
            newArr[i][0]=0;
        for(int i=0;i<num2;i++)
            newArr[0][i]=0;
        //Check each element through Looping Concept
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    newArr[i][j]=newArr[i-1][j-1]+1;
                }
                else{
                    newArr[i][j]=Math.max(newArr[i-1][j],newArr[i][j-1]);
                }
            }
        }
        return newArr[num1][num2];
    }

    //Declaration of the Driver Class
    public static void main(String[] args){
        try(Scanner scanner=new Scanner(System.in)){
            String string1=scanner.nextLine();
            String string2=scanner.nextLine();
            int a=CalculateLCS(string1, string2);
            System.out.println("The Longest Commong SubSequence is found to be :"+a);
            scanner.close();
        }catch(Exception e){
            System.out.println("Exception Found ! ! ! !\n"+e.getMessage());
        }
        return;
    }
}
