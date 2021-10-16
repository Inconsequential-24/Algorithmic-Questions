#include<iostream>
using namespace std;
int main(){
    int i,n,j,target;
    cout<<"Enter size:";cin>>n;
    int a[n];
    cout<<"Enter elements\n";
    for(i=0;i<n;i++)
    cin>>a[i];
    cout<<"Enter target:";cin>>target;
    for(i=0;i<n-1;i++)
    for(j=i+1;j<n;j++)
    if(a[i]+a[j]==target)
    cout<<i<<","<<j<<endl;
}
