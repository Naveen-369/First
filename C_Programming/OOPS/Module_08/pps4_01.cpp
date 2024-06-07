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
T sume(vector<T> a){
    T sum=0;
    for(auto i:a){
        sum+=i;
    }
    return sum;
}
int main(){
    auto isum=sume(get(1));
    auto fsum=sume(get(1.0));
    int sum=0;
    for(int i=0;i<5;i++){
        int a=0;
        scanf("%dL",&a);
        sum+=a;
    }
    cout<<isum<<endl;
    cout<<fsum<<endl;
    cout<<sum<<"L"<<endl;
    return 0;
    
    
}