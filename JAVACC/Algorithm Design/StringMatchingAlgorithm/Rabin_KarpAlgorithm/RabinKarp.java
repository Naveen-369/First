package StringMatchingAlgorithm.Rabin_KarpAlgorithm;
/*
    Function:
        -> Generate a Hash value 
        ->Generate the hash value each time
        Checks for (entry point)
*/

public class RabinKarp{
    public static void main(String[] args){
        int[] Alphabets=new int[26];
        char Variable='A';
        for(int i=1;i<=26;i++){
            Alphabets[Variable-'A']=i;
            Variable++;
        }
        String str1="CAECAECABCAD";
        String str2="CAB";
        CallRabinKarp(str1,str2,Alphabets);
        return;
    }
    
    //Declaration of the funtion - 1
    public static void CallRabinKarp(String str1,String str2,int[] arr){
        int Known_Answer=Calc(str2,arr);
        System.out.println("The key id : "+Known_Answer);
        String summa="";
        for(int i=0;i<str1.length()-3;i++){
            if(i+str2.length()<str1.length()-1){
                summa=str1.substring(i,i+str2.length());
            }
            else{
                summa=str1.substring(i);
            }
            int Checks=Calc(summa,arr);
            System.out.println(Checks);
            if(Checks==Known_Answer)
                System.out.println("A Match found at the starting index : "+i);
        }
    }
    
    //Declaration of the function Calc
    public static int Calc(String str1,int[] arr){
        char[] arrary=str1.toCharArray();
        int ans=0;
        int g=str1.length()-1;
        for(char c:arrary){
            ans+=arr[c-'A']*(int)Math.pow(10,g);
            g--;
        }
        return ans;
    }
}