#include <iostream>

using namespace std;

int main()
{   int n;
    int count=0;
    int arr[8]={1,3,5,7,3,1,2,4};
    cout<<"Enter the number : ";
    cin>>n;
    for(int i=0;i<=7;i++){
        if(arr[i]==n){
            count++;
        }
    }
    cout<<"\n The number was "<<count<<" times in the array";
    return 0;
}
