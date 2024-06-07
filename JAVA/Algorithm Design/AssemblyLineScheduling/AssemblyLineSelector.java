package AssemblyLineScheduling;

/**
 * Concept Declaration
 * Create a funtion that takes the stations, Transition cost, Start cost and the exit cost
 * It must Create two arrays of station size+1
 * Set the base condition for the first station
 * Using loops to iterate through the stations, Place the minimum value in the arrays
 */

public class AssemblyLineSelector {
    //Declaring the function
    public static int LineSelector(int[][] Station,int[][] Transition,int[] Entry,int[] Exit){
        int n=Station[0].length;
        int[] T1=new int[n];
        int[] T2=new int[n];
        //Delcaring the base condition for the first station
        T1[0]=Station[0][0]+Entry[0];
        T2[0]=Station[1][0]+Entry[1];
        //Concept Utilization
        for(int i=1;i<n;i++){
            T1[i]=Math.min((T1[i-1]+Station[0][i]),(T2[i-1]+Transition[1][i-1]+Station[0][i]));
            T2[i]=Math.min((T2[i-1]+Station[1][i]),(T1[i-1]+Transition[0][i-1]+Station[1][i]));
        }
        return Math.min(T1[n-1]+Exit[0],T2[n-1]+Exit[1]);
    }

    //Declaration of the driver class
    public static void main(String[] args){
        int[][] Station={{7,9,3,4,8,4},{8,5,6,4,5,7}};
        int[][] Transition={{2,3,1,3,4},{2,1,2,2,1}};
        int[] entry={2,4};
        int[] exit={3,2};
        int i=LineSelector(Station, Transition, entry, exit);
        System.out.println(i);
        return;
    }
}
