#include <iostream>
using namespace std;
class coordinates{
    public:
    double xvalue;
    double yvalue;
    friend istream &operator>>(istream &inp,coordinates &ci){
        inp>>ci.xvalue>>ci.yvalue;
        return inp;
    }
    friend ostream& operator<<(ostream& out,coordinates& ci){
        out<<"("<<ci.xvalue<<", "<<ci.yvalue<<")"<<endl;
        return out;
    }
};
int main(){
    coordinates c1,c2;
    cout<<"Enter x and y coordinates for first point, separated by a space: :";
    cin >> c1;
    cout<<"Enter x and y coordinates for second point, separated by a space: :";
    cin >> c2;
    if(c1.xvalue==c2.xvalue && c1.yvalue==c2.yvalue){
            cout<<"Invalid Input ! !"<<endl;
    }
    else{
        cout<<"First point is at : ";
        cout<<c1;
        cout<<"Secound point is at : ";
        cout<<c2;
    }
    return 0;
}