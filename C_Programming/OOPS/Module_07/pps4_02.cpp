/*Get an odd number input and oveload the ++ profix operatr and --prefix operator*/

#include <iostream>
using namespace std;
class odd_number
{
    int num;
    public:
    void getnum(){
        cout<<"Enter a number : "<<endl;
        cin>>num;
    }
    void operator++(){
        num++;
    }
    void operator--(){
        num--;
    }
    void printnum(){
        cout<<"Number : "<<num<<endl;
    }
};

int main(){
    odd_number n;
    n.getnum();
    string str;
    cin >> str;
    if(str=="++"){
        ++n;
    }
    if(str=="--"){
        --n;
    }
    n.printnum();
    return 0;
}