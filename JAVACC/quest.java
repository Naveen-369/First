public class quest {
    public static int findder(int n,int arr[]){
        int c=0;
        int sum=n*(n+1);
        sum/=2;
        for(int i:arr){
            c+=i;
        }
        int a=sum-c;
        return a;
    }
    public static void main(String args[]){
        int a=5;
        int arr[]={1,3,2,5};
        int ans=findder(a,arr);
        System.out.println(ans);
        return;
    }
}
