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
T product(vector<T> a){
    T pro=T(1);
    for(auto i:a){
        pro*=i;
    }
    a.clear();
    return pro;
}
int main(){
    auto isum=product(get(5));
    auto fsum=product(get(5.0));
    int sum=1;
    for(int i=0;i<5;i++){
        int a;
        scanf("%dL",&a);
        sum*=a;
    }
    cout<<isum<<endl;
    cout<<fsum<<endl;
    cout<<sum<<"L"<<endl;
    return 0;
    
    
}