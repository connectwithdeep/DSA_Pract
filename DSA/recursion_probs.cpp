#include<bits/stdc++.h>
using namespace std;
//palindrome
bool isPalindrome(string& str) {
    if (str.length() <= 1) {
        return true;
    }

    if (str.front() != str.back()) {
        return false;
    }

    str.pop_back();
    str.erase(str.begin());

    return isPalindrome(str);
}

//sum of n-terms
long long sum =0;
long long sumFirstN(long long n) {
    if(n==0){
        return 0;
    }
    sum+=n;
    sumFirstN(n-1);
    return sum;
}

//reversing an array
vector<int> reverseArray(int n, vector<int> &nums)
{
    vector<int> result;
    for(int i=n-1;i>=0;i--){
        result.emplace_back(nums[i]);
    }
return result;
}

// reversing array using recursion 
int temp;
void reverseArrayHelper(vector<int> &nums, int start, int end) {
    if (start >= end) {
        return;
    }

    // swap(nums[start], nums[end]);
    temp=nums[start];
    nums[start]=nums[end];
    nums[end]=temp;
    reverseArrayHelper(nums, start + 1, end - 1);
}
vector<int> reverseArray(int n, vector<int> &nums) {
    reverseArrayHelper(nums, 0, n - 1);
    return nums;
}

//factorial
vector<long long> factorialNumbers(long long n) {
    vector<long long> result;
    long long factorial = 1;
    for (long long i = 1; factorial <= n; i++) {
        result.push_back(factorial);
        factorial *= i + 1;
    }
    sort(result.begin(), result.end());
    return result;
}

int main(){

}

//fibonacci number
int fib(int n){
    if(n<=1){
        return n;
    }
    int first=fib(n-1);
    int second=fib(n-2);
    return first+second;
}
