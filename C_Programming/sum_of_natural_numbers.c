#include <stdio.h>
int main(){
    int n,sum=0;
    printf("Enter a number : ");
    scanf("%d",&n);
    sum=n*(n+1);
    sum=sum/2;
    printf("\nThe sum of first %d natural numbers is found to be %d",n,sum);
    return 0;
}