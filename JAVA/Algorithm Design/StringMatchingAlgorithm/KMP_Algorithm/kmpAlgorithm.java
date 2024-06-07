package StringMatchingAlgorithm.KMP_Algorithm;
//Declaration of the function for LCS tsble
public class kmpAlgorithm{
    public static void main(String[] args){
        String s1="ABCEABCDABEABCDABCDABDEABCDABD";
        String s2="ABCDABD";
        LCS_Compare(s1,s2);
        System.out.println("The Starting index is found to be : ");
    }
    
    //Definition of the Functio LCS_Compare
    public static void LCS_Compare(String s1,String s2){
        int len1=s1.length();
        int len2=s2.length();
        int[] LPS_Array=GenerateLCS(s2);
        int i=0,j=0;
        while(i<len1){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            if(j==len2){
                System.out.println("Found at index : "+(i-j));
                j=LPS_Array[j-1];
            }
            else if(i<len1 && s1.charAt(i)!=s2.charAt(j)){
                if(j!=0)
                    j=LPS_Array[j-1];
                else
                    i++;
            }
        }
    }
    //Definition of the LCSGEnerator
    public static int[] GenerateLCS(String s1){
        int n=s1.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=0;
        //Definition of the concept
        int i=0;
        for(int j=1;j<n;j++){
            if(s1.charAt(i)==s1.charAt(j)){
                i++;
                arr[j]=i;
            }
            else{
                arr[j]=0;
                i=0;
            }
        }
        return arr;
    }
}