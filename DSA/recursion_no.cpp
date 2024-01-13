#include <bits/stdc++.h>
using namespace std;
int cnt=1;
void num(int n){
    
    if (cnt>n) return;
    cout<< cnt<<endl;
    cnt++;
    num(n);
}
void rev(int i,int n){
    
    if (i<1) return;
    cout<< i<<endl;
    i--;
    rev(i,n);
}
int main()
{   int a;
    cin>>a;
    num(a);
    rev(a,a);
    return 0;
}
