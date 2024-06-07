#include <stdio.h>
int main(){
    int i;
    int num[10]={1,2,3,4,5,6,7,8,10,15};
    int min,max;
    min=num[1];max=num[1];
    for (i=0;i<10;i++){
        if (min>num[i])
        {min=num[i];}   
        if (max<num[i])
        max=num[i];
    }
    printf("\nThe minimum value for the given array is found to be %d",min);
    printf("\nThe maximum value for the given array is found to be %d",max);
    return 0;
}