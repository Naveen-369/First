/*Factorial*/
#include<stdio.h>
int main(){
    int num,i,fact=1;
    printf("Enter the number whose factorials has to be found : ");
    scanf ("%d",&num);
    for (i=1;i<=num;i++){
        fact=fact*i;
    }
    printf("THe factorials of the given number is found to be %d",fact);
    return 0;
}