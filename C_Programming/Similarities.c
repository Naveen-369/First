#include <stdio.h>
int main(){
    int i,j,a=0;
    int num1[10]={1,2,3,4,5,6,7,8,9,10};   /*Declaration of array number 1*/
    int num2[10]={1,2,3,4,5,6,7,8,9,10};   /*Declaration of array number 2*/
    if (sizeof(num1)==sizeof(num2)){
        for (int i=0; i<=10; i++){
            if (num1[i]==num2[i]){
                a+=1;
        }
        
    }

    }
    if (a==10){
        printf("Matching");
    }
    else{
        printf("Failed in matching");
    }
    return 0;
}