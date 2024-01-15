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
//reversing an array
vector<int> reverseArray(int n, vector<int> &nums)
{
    vector<int> result;
    for(int i=n-1;i>=0;i--){
        result.emplace_back(nums[i]);
    }
return result;
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