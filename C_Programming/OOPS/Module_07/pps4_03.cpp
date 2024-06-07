#include <iostream>
using namespace std;

class payment
{
    int consolidated_pay;
    int number_of_hours;
    int Basic;
    int HRA;
    int DA;
    int Wages_per_hour;
    int Regular_employees;
    int Daily_wages;
    int Consolidated;
    public:
    /*To get data*/
    void putdata(){
        cout<<"Basic=";
        cin>>Basic;
        cout<<"HRA=";
        cin>>HRA;
        cout<<"DA=";
        cin>>DA;
        cout<<"Wages per hour=";
        cin>>Wages_per_hour;
        cout<<"Number of hours=";
        cin>>number_of_hours;
        cout<<"Consolidated Pay=";
        cin>>consolidated_pay;
    }
    /*To calculate the pays*/
    void calculate(){
        Regular_employees=Basic+HRA+DA;
        Daily_wages=Wages_per_hour*number_of_hours;
        Consolidated=consolidated_pay;
    }
    /*print the output*/
    void getdata(){
        if (Basic < Consolidated){
            cout<<"Invalid Pay Scale"<<endl;
        }
        else{
            cout<<"\n"<<"Output"<<"\n"<<endl;
            cout<<"Regular employees ="<<Regular_employees<<endl;
            cout<<"Daily wages ="<<Daily_wages<<endl;
            cout<<"Consolidated Pay ="<<Consolidated<<"\n"<<endl;
        }
    }

    friend void salary(payment &pay);
};

void salary(payment &pay){
    pay.putdata();
    pay.calculate();
    pay.getdata();
}

int main(){
    payment p;
    salary(p);
    return 0;
}