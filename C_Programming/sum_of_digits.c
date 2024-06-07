#include<stdio.h>
int main(){
    int num,a,b=0;
    printf("Enter a number : ");
    scanf("%d",&num);
    while (num!=0){
        a=num%10;
        b+=a;
        num/=10;
    }
    printf("The sum of the given numbers's digits is found to be %d",b);
    return 0;
}