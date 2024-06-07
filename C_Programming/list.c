#include<stdio.h>
/*Create a list 
insert an element 
display all elements
delete the elements from the list
Search an element from the list */
int create();
int insert(int);
int displ();
int dele(int);
int find(int);
int pointer=0;
const int max=12;
int list[12];
int main(){
    int n=max;
    int c;
    do{
        printf("\n");
    printf("\n1.Create a list \n2.Insert an element \n3.Display all elements \n4.Delete the elements from the list \n5.Search an element from the list \n Press any other numbers to exit the program ! ! ! ! ");
    printf("\nThe operation to be performed : ");
    scanf("%d", &c);
    int f;
    switch (c)
    {
    case 1:
        create();
        printf("\n");
        printf("\nCreated");
        break;
        case 2:
        printf("Enter the number to be inserted : ");
        scanf("%d", &f);
        insert(f);
        printf("\n");
        printf("\nInserted");
        break;
        case 3:
        displ();
        printf("\n");
        printf("\nDisplayed");
        break;
        case 4:
        printf("\n Enter the position of the value to be deleted : ");
        scanf("%d", &f);
        dele(f);
        printf("\n");
        printf("\nDeleted");
        break;
        case 5:
        printf("\nEnter the value to be searched : ");
        scanf("%d", &f);
        printf("\n");
        find(f);
        printf("\nFunction Accomplished");
        break;
        default:
        printf("\n");
        printf("\nThank you");
        break;
    
    }
}while (c!=6);
return 0;
}

int create(){
    int i,n,data;
    printf("Enter the number of elements to be inserted : ");
    scanf("%d",&n);
    for (i=0;i<n;i++){
        if (pointer < max){
        printf("Enter the value : ");
        scanf("%d",&data);
        list[i] = data;
        pointer++;}
        else{
            printf("List overflow ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ");
            break;
        }
    }
    
}

int insert(int a){
    if (pointer <max){
    list[pointer] = a;
    pointer++;}
    else {
        printf("List overflow ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
    }
}

int displ(){
    for (int i=0; i<=pointer-1;i++){
        printf("\t%d ",list[i]);
    }
}

int dele( int a)/*This is position not value*/{
    if (pointer <0 ){
        printf("\tNull list cannot undergo this function ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
    }
    else if (a>pointer){
    printf("\t Invalid adddress entered  ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ")
    }
    else{
    for(int i =a;i<=pointer;i++){
        list[i]=list[i+1];
    }}
    pointer--;
}

int find(int a){
    int d=pointer;
    for (int i = 0; i<=d;i++){
        if (list[i]==a){
            printf("\nThe element is located at the index position of %d",i);
        }
    }
}

/*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*//*THE END*/
