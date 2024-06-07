/*1. Create a class string that reads the string and its length. Write a program to overload the 
operator < and > to compare two strings. if s1 i< s2 then print "String s1 is smaller than 
String s2", if s2< s1 then print "String s2 is smaller than String s1" otherwise print "Both 
the Strings s1 and s2 are Equal". */

#include <iostream>
using namespace std;
class String
{
    string s1;
    public:
    void getstr(){
        cout<<"Enter your Strings : "<<endl;
        getline(cin,s1);
    }
    friend void operator<(String &s,String &s2);
};
void operator<(String &s,String &s2){
    int a,b;
    a=s.s1.size();
    b=s2.s1.size();
    if(a<b)
    cout<<"String1 is lower than String2"<<endl;
    else if(a==b)
    cout<<"The Strings are equal"<<endl;
    else
    cout<<"String2 is lower than String1"<<endl;
}
int main(){
    String str1, str2;
    str1.getstr();
    str2.getstr();
    str1<str2;
    return 0;
}