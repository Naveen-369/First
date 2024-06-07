#include <stdio.h>
#include <stdlib.h>
struct node{
    int val;
    struct node *left,*right;
};
typedef struct node bstn;
bstn *root=NULL;
bstn *temp;
/*Creating for first element*/
bstn* create(int a){
    bstn *NewNode=(bstn *) malloc(sizeof(bstn));
    temp=NewNode;
    NewNode->val=a;
    (*NewNode).left=NULL;
    (*NewNode).right=NULL;
    if(root==NULL){
        root=NewNode;
    }
    return temp;
}
/*Searching*/
bstn* search(bstn *root,int key){
    if(root==NULL || root->val==key){
        return root;
    }
    else if(key>(*root).val){
        return search(root->right,key);
    }
    else{
        return search(root->left,key);
    }
}

/*insert*/
bstn* insert(bstn* root,int x){
    if(root==NULL)
        return create(x);
    else if(x>root->val)
        root->right=insert(root->right,x);
    else
        root->left=insert(root->left,x);
    return root;
}

/*inorder*/
void inorder(bstn* root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d , ",root->val);
        inorder(root->right);
    }
}

/*Delete*/
bstn* delete(bstn* root,int  x){
    if(root==NULL) 
        return root;
    if(x>root->val)
        root->right=delete(root->right,x);
    else if (x<root->val)
        root->left=delete(root->left,x);
    else{
        if(root->left==NULL && root->right==NULL){
            free(root);
            return NULL;
        }
        else if(root->left==NULL && root->right==NULL){
            if(root->left==NULL)
                temp=root->right;
            else
                temp=root->left;
            free(root);
            return temp;
        }
        else{
            temp=min(root->right);
            root->val=temp->val;
            root->right=delete(root->right,temp->val);
        }
    }
    return root;
}

/*Minimum*/
bstn* min(bstn* root){
    if(root==NULL) return NULL;
    else if(root->left!=NULL)
        return min(root->left);
    return root;
}

int main(){
    int ch;
    bstn* root;
    bstn* suma;
    do{
        printf("\n1.Create\n2.Insert\n3.Inorder\n4.Search\n5.Delete\n6.Exit\n");
        scanf("%d",&ch);
        int n;
        switch (ch){
            case 1:
            printf("Enter a number : ");
            scanf("%d",&n);
            root=create(n);
            break;
            case 2:
            printf("Enter a number : ");
            scanf("%d",&n);
            insert(root,n);
            break;
            case 3 :
            inorder(root);
            break;
            case 4:
            printf("Enter the number to be searched : ");
            scanf("%d",&n);
            search(root,n);
            break;
            case 5:
            printf("Enter the value to be deleted : ");
            scanf("%d",&n);
            delete(root,n);
            break;
            case 6:
            printf("Thank you");
            break;
            default:
            printf("Invalid input has been entered ! ! ! !");
            break;
        }
    }while(ch!=6);
    return 0;
}