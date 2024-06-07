#include <stdio.h>
#include <stdlib.h>
/*StructureDeclaration*/
struct lnode{
  int data;
  struct lnode* NextVal;
};
typedef struct lnode node;
node *head=NULL;
/*Function Declarations*/
void Display();
void InsertAtFront(int);
int ReadValue(int);
void DeleteAtPosition(int);
int count();
void InsertAtEnd(int);
void InsertAtPosition(int pos,int data);
void Rdisplay();
/*Main Function Declaration*/

int main () {
  int i, data,pos;

do{
    printf("\n1.Insert element the the beginning\n2.Insert element at the specified position\n3.Delete at a specified position\n4.Display all elements\n5.Display all elements in reverse order\n6.Read a valua at a particular postion \n7.Insert the element at the end of the linked list\n8.Exit\t");
    printf("\nEnter your Choice : ");
    scanf("%d", &i);
    switch(i){
        case 1:
        printf("Enter the Data : ");
        scanf("%d", &data);
        InsertAtFront(data);
        break;
        case 2:
        printf("Enter the Data : ");
        scanf("%d", &data);
        printf("Enter the position :  ");
        scanf("%d", &pos);
        InsertAtPosition(pos,data);
        break;
        case 3:
        printf("Enter the position of the element to be deleted : ");
        scanf("%d", &pos);
        DeleteAtPosition(pos);
        break;
        case 4:
        printf("\n");
        Display();
        printf("\n");
        break;
        case 5:
        printf("\n");
        Rdisplay();
        printf("\n");
        break;
        case 6:
        printf("Enter the Position of whose (data) has to be fetched :" );
        scanf("%d", &data);
        pos=ReadValue(data);
        printf("\nThe element is found to be : %d", pos);
        break;
        case 7:
        printf("Enter the value to be inserted : ");
        scanf("%d", &data);
        InsertAtEnd(data);
        break;
        case 8:
        printf("\nThe program has been executed successfully\n");
        printf("\n");
        break;
        default:
        printf("\nInvalid input ! ! ! ! Enter a proper input : ");
        break;

    }
  }while(i!=8);

  return 0;
}



/*InsertAtFront Function */
void InsertAtFront(int a){
  node *NewNode=(node*) malloc(sizeof(node));
  (*NewNode).data=a;
  if(head==NULL){
    (*NewNode).NextVal=NULL;
    head=NewNode;
  }
  else{
    NewNode->NextVal=head;
    head=NewNode;
  }

}

/*Function to display all the elemens of the linked list*/
void Display(){
  if(head==NULL){
    printf("The list is compltely empty ! ! ! !");
  }
  else{
    node *temp=head;
    while(temp!=NULL){
      printf("%d\t",temp->data);
      temp=(*temp).NextVal;
    }
  }
}

/*Counting Funciton declaration*/
int count(){
  int n=0;
  node *temp=head;
  while(temp!=NULL){
    n++;
    temp=temp->NextVal;
  }
  return n;
}

/*Display the elements in the list */
int ReadValue(int a){
  a--;
  node *temp=head;
  for(int i=0;i<a;i++){
    temp=(*temp).NextVal;
  }
  printf("\n%d is found at the Specified posistion\n",temp->data);
  int ans=(*temp).data;
  return ans;
}

/*Insert at a specified POsition with the data and the position as the paramenter*/
void InsertAtPosition(int pos,int val){
  node* NewNode=(node*)malloc(sizeof(node));
  NewNode->data=val;
  node* temp=head;
  for(int i=0;i<pos-1;i++){
    temp=temp->NextVal;
    if(temp==NULL){
      printf("\nInvalid input has been given ! ! ! !\n");
      return;
    }    
  }
  NewNode->NextVal=temp->NextVal;
  temp->NextVal=NewNode;
  return;
}

/*Deletion of the node in liked list*/
void DeleteAtPosition(int pos){
  int i;
  node* temp=head;
  node* beforenode;
  if(head==NULL){
    printf("THe linked list Has Nothing that is it os found to be empty");
    return;
  if(pos==0){
    head=head->NextVal;
    free(temp);
    return;
  }
  }
  for(i=1;i<=pos;i++){
    beforenode=temp;
    temp=temp->NextVal;
    if(temp==NULL){
      printf("Invalid Position");
      return;
    }
  }
  beforenode->NextVal=temp->NextVal;
  free(temp);
  return;
}

/*Function to reverse the linked list */
void Rdisplay(){
  int i=0;
  int x=count();
  int datra[x];
  printf("\n");
  if(head==NULL)
  {
    printf("The list is compltely empty ! ! ! !");
  }
  else{
    node *temp=head;
    while(temp!=NULL){
      datra[i]=temp->data;
      i++;
      temp=(*temp).NextVal;
    }
  }
  
  for(int k=i-1;k>=0;k--){
    printf("%d\t",datra[k]);
  }
  return;
}

/*Insert Elemtents at the end of the linked list*/

void InsertAtEnd(int val){
    node *ptr,*temp;
    ptr = head;
    temp = malloc(sizeof(node));
    temp->data = val;
    temp->NextVal = NULL;
    while (ptr->NextVal != NULL){
        ptr = ptr->NextVal;
    }
    ptr->NextVal = temp;
    return;
}
