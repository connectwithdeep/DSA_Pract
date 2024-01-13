/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <bits/stdc++.h>
using namespace std;
int cnt=1;
void nt(string s,int n){
    
    if (cnt>n) return;
    cout<< s<<endl;
    cnt++;
    nt(s,n);
}

int main()
{   
    string name;
    cout<<"Enter name : ";
    cin>>name;
    int a;
    cout<<"Enter no. of times you want to get the name printed : ";
    cin>>a;
    nt(name,a);
    return 0;
}
