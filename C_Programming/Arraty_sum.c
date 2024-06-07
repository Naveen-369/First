#include <stdio.h>
int main(){
    int sum=0;
    int num[10]={1,2,3,4,5,6,7,8,9,10};
    for (int i=0; i<=10; i++){
        sum+=num[i];
    }
    printf("The sum of the given array is found to be %d",sum);
    return 0;
}
