#include <iostream>
#include <vector>
#include <cstdio>
using namespace std;
template <class T>
vector<T> get(T n){
    T a;
    vector<T> val;
    for(int i=0;i<5;i++){
        cin>>a;
        val.push_back(a);
    }
    return val;
}

template <class T>
T getmax(vector<T> a){
    T max=a[0];
    for(auto i:a){
        if(max<i){
            max=i;
        }
    }
    a.clear();
    return max;
}
int main(){
    auto i=getmax(get(5));
    auto f=getmax(get(5.0));
    vector<int> longint;
    for(int i=0;i<5;i++){
        int a;
        scanf("%dL",&a);
        longint.push_back(a);
    }
    int l=getmax(longint);
    cout<<i<<"\n"<<f<<"\n"<<l<<"L"<<endl;
    return 0;
    
    
}