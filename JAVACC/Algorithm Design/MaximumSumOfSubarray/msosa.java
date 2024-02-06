package MaximumSumOfSubarray;
import java.util.Arrays;
import java.util.Scanner;
/*
*Create a function that is executed repeatedly and finds the lss,rss and css only if it is minimum
*/
public class msosa{
    //Declaration of the driver class
    public static void main(String[] arg){
        int n;
        int[] array;
        //This two lines are the clear the terminal / Console output screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        //Start of Program Infterface
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\tPROGRAM EXECUTION ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t-----------------");
        //Get inputs from the user
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements : ");
            n =scanner.nextInt();
            array=new int[n];
            System.out.println("Enter the elements : ");
            for(int i=0;i<n;i++){
                array[i]=scanner.nextInt();
            }
            scanner.close();
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
            return;
        }
        //Perform operations
        int aa=MaxsubArr(array);
        //Printing the result
        System.out.println("\t\t\t\t\t\t\t\t\t*** -----------------------------------------------***");
        System.out.println("\t\t\t\t\t\t\t\t\t    |\t    The maximum possible sum is "+aa+"    \t  |");
        System.out.println("\t\t\t\t\t\t\t\t\t    -----------------------------------------------");
        return;
    }
    
    //Declaration of the function
    public static int MaxsubArr(int[] arr){
        int min=0;
        int max=arr.length;
        int mid=(max+min)/2;
        int lss,rss,css=0;
        if(max>1){
            lss=MaxsubArr(Arrays.copyOfRange(arr,0,mid));
            rss=MaxsubArr(Arrays.copyOfRange(arr,mid,max));
            css=findmaxsum(arr);
        }
        else{
            lss=rss=css=arr[0];
        }
        //Returns the maximum of rss,lss,css
        return (lss>rss ? (lss>css ? lss : css) : (rss>css ? rss : css));
    }
    public static int findmaxsum(int[] arr){
        int end=arr.length/2;
        int lsum=arr[end-1];
        int lmax=lsum;
        int rsum=arr[end];
        int rmax=rsum;
        //Finding the value of the leftsum subarray
        for(int i = end-2;i>=0;i--){
            if((lsum+arr[i])>lmax){
                lmax=lsum+arr[i];
            }
            lsum+=arr[i];
        }
        //Finding the value of the rightsum subarray
        for(int i=end+1;i<arr.length;i++){
            if((rsum+arr[i])>rmax){
                rmax=rsum+arr[i];
            }
            rsum+=arr[i];
        }
        // returing the maximum possible sum
        return lmax+rmax;
    }
}