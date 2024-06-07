#include <iostream>
using namespace std;
class MathSymbol/*Abstract Class*/
{
    public:
    int op1;
    int op2;
    MathSymbol(int a,int b){
        op1=a;
        op2=b;
    }
    virtual int doOperator()=0;
};

class Plus:public MathSymbol
{
    public:
    Plus(int a,int b):MathSymbol(a,b) {}
    int doOperator(){
        cout<<"Addition : "<<op1+op2<<endl;
        return op1+op2;
    }
};
class Minus:public MathSymbol
{
    public:
    Minus(int a ,int b):MathSymbol(a,b){}
    int doOperator(){
        cout<<"Subraction : "<<op1-op2<<endl;
        return op1-op2;
    }
};
int main(){
    int a,b;
    cout<<"Enter two numbers : ";
    cin>>a>>b;
    if(a==b && a==0){
        cout<<"All Zeros"<<endl;
    }
    else{
        MathSymbol *ptr;
        Plus p(a,b);
        ptr=&p;
        ptr->doOperator();
        Minus m(a,b);
        ptr=&m;
        ptr->doOperator();
        }
    return 0;
}