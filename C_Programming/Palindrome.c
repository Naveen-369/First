#include<stdio.h>
int main(){
    int num;
    printf("Enter the  Number : ");
    scanf ("%d",&num);
    int a,b=0,c;
    c=num;
    while(num!=0){
        a=num%10;
        b=b*10+a;
        num/=10;
    }

    if (c==b){
        printf("The given number is a perfect palindrome number. ");
    }
    else {
        printf("The given number is not a pilindrome ! ! ! ! !");
    }
    return 0;
}