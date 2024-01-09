#include <bits/stdc++.h>
using namespace std;

void pattern1(int N)
{ for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<N-i-1; j++)
        {
            cout <<" ";
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            cout<<"*";
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<N-i-1; j++)
        {
            cout <<" ";
        }
        cout << endl;
    }
}
void pattern2(int N)
{ for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            cout <<" ";
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*N-(2*i+1);j++){
            
            cout<<"*";
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<i; j++)
        {
            cout <<" ";
        }
        cout << endl;
    }
}
void pattern3(int n) {
    for(int i=1;i<=2*n-1;i++){
int star=i;
if(i>n)star=2*n-i;
for(int j=1;j<=star;j++){
    cout<<"*";
}cout<<endl;
    }
}
void pattern4(int N){
    int start;
    for(int i=0;i<N;i++){
                    if(i%2==0) start=1;
            else start=0;
        for(int j=0;j<=i;j++){
            cout<<start<<" ";
            start=1-start;
        }
        cout<<endl;
    }
}
void pattern5(int n){
    int space=2*(n-1);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<j;
        }
        for(int j=1;j<=space;j++){
            cout<<" ";
        }
        for(int j=i;j>=1;j--){
            cout<<j;
        }
        cout<<endl; 
        space=space-2;
    }

}
void pattern6(int n){
            for(int i=0;i<n;i++){
        for(char j='A';j<='A'+i;j++){
            cout<<j<<" ";
        }   
        cout<<endl;
    }
}
void pattern7(int n){
        for(int i=0;i<n;i++){
        for(char j='A';j<'A'+n-i;j++){
            cout<<j<<" ";
        }   
        cout<<endl;
    }
}
void pattern8(int n){
       char c='A';
    for(int i=1;i<=n;i++){
      for (int j = 1; j <= i; j++) {
        cout << c << " ";
      }
      c = c + 1;
      cout << endl;
    }
}
int main()
{   
    int N;
    cin>>N;
    pattern1(N);
    pattern2(N);
    pattern3(N);
    pattern4(N);
    pattern5(N);
    pattern6(N);
    pattern7(N);
    pattern8(N);
    return 0;
}