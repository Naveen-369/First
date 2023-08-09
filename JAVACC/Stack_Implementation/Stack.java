package Stack_Implementation;

public class Stack{
    private int arr[]=new int[10];
    private int top=-1;
    //Push function to the stack
    void push(int data){
        if(top>=9){
            System.out.println("Stack Overflow has occured ! ! ! ");
        }
        else{
            arr[++top]=data;
        }
        return;
    }
    //Pop function to the stack
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow has occurred ! ! ! ");
            return -1;
        }
        else{
            return arr[top--];
        }
    }
    //Display function to display the elements in the stacks
    void display(){
        if(top<0){
            System.out.println("No Elements in the stack ! ! ! ");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }
        return;
    }
}
