#include <stdio.h>
int main(){
    int a,b,c;
    printf("Enter three numbers seprated by spaces : ");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a>c){
        printf("The greaetst number is %d",a);
    }
    else if (b>c && b>a){
        printf("The greatest number is %d",b);
    }
    else{
        printf("The greatest number is %d",c);
    }
    return 0;
}