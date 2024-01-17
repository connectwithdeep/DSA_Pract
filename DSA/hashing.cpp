#include <iostream>

using namespace std;

int main()
{   int n;
    cout<<"Enter the number : ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
        }
    int hash[13]={0};// can be upto 1000000 in main() and 10000000 in global scope for int and *10 extra for bool;
    for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
    cout<<"Enter the number you want to find the occurence of ";
        int number;
        cin>>number;
        cout<<hash[number]<<" times"<<endl;
    
    return 0;
}
