#include <stdio.h>
int main(){
    int num,rem,rev=0,a=0;
    printf("Enter a number : ");
    scanf("%d",&num);
    while(num!=0){
        rem=num%10;
        rev=rev*10+rem;
        num/=10;
        a+=1;
    }
    printf("The number of digits is found to be %d",a);
    return 0;
}