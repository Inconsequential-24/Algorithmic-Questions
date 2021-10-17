#include<iostream>
using namespace std;
int main(){
    int n,i,max=0;
    cout<<"Enter array size:";cin>>n;
    int a[n];
    cout<<"Enter elements:";
    for(i=0;i<n;i++){
        cin>>a[i];
        if(a[i]>max)
        max=a[i];
    }
    cout<<max;
    return 0;
}
