#include <stdio.h>
int main(){
    int i,num,che=0,a,b,c,d=0;
    printf("Enter a number to be checked for palindrome : ");
    scanf ("%d",&num);
    a=num;
    while(num!=0){
        d+=1;
        num/=10;
    }
    num=a;
    while (num!=0){
        b=num%10;
        num/=10;
        c=1;
        for (i=0; i<d; i++){
            c=c*b;
        }
        che=che*1+c;
    }
    if (a==che){
        printf ("\nTHe entered number is a perfect armstrong number.\n _");
    }
    else{
        printf("\nThe entered number is not an armstrong number. FAILED ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !\n _");
    }
    
}