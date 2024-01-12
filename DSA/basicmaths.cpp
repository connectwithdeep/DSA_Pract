#include <bits/stdc++.h>
using namespace std;
int reverse(int x){
    int result=0;
            int tn;
    while (x != 0) {
        int digit = x % 10;
        x = x / 10;
       result=result*10+digit ;
    }
cout<<result<<endl;
}
void palindrome(int x){
    int original=x;
int result=0;
    while (x != 0) {
        int digit = x % 10;
        x = x / 10;
       result=result*10+digit;
    }
if(original==result || original == -result){
    cout<<"Palindrome"<<endl;}
else {cout<<"Not a palindrome"<<endl;    }
}
void armstrong(int x){
    int numDigits = 0;

    int temp = x;
    while (temp != 0) {
        temp /= 10;
        numDigits++;
    }

    int result = 0;
    temp = x;

    while (temp != 0) {
        long digit = temp % 10;
        temp /= 10;
        result += pow(digit, numDigits);
    }

    if (x == result) {
        cout << "Armstrong no." << endl;
    } else {
        cout << "Not an Armstrong no." << endl;
    }

}
int summofalldivisor(int n){ //till n
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= sqrt(i); j++) { //j*j can also be written for decreasing complexity
            if (i % j == 0) {
                sum += j;
                if (i / j != j) {
                    sum += i / j;
                }
            }
        }
    }
    cout<< sum<<" is the sum of all digits "<<endl;


}
bool primenum(int n){
    int count=0;
    for (int i = 1; i*i <= n; i++) {
    if (n % i == 0) {
        count++;
    if (n / i != i) {
         count++;
    }}
        if (count>2) break;
    }
if(count==2){
    cout<<"Prime Number"<<endl;
    return true;
}
else {
    cout<<"Not a prime number"<<endl;
    return false;
}}
int gcd_hcf(int a){
    int b;
    cout<<"Enter second number: ";
    cin>>b;
    while(a>0 && b>0){
    if(a>b) a=a%b;
    else b=b%a;
}
if (a==0){
    cout<<b<<" is gcd"; return b;}
else {cout<<a<<" is gcd"; return a;}
}

int main(){
    int num;
    cin>>num;
    // reverse(num);
    // palindrome(num);
    // armstrong(num);
    // summofalldivisor(num);
    // primenum(num);
    gcd_hcf(num);
}