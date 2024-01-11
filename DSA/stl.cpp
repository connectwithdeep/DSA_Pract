#include <bits/stdc++.h>

using namespace std;
void min_prior_q(){ //also called min heap
    int element;
    priority_queue<int,vector<int>,greater<int>> a;
    for(int i=1;i<=5;i++){
        cin>>element;
        a.push(element);
    }
    cout<<a.top()<<endl;
    a.pop();
    cout<<a.top()<<endl;
}
void max_prior_q(){ //also called max heap
   int element;
    priority_queue<int> a;
    for(int i=1;i<=5;i++){
        cin>>element;
        a.push(element);
    }
    cout<<a.top();
    a.pop();
    cout<<a.top();
}
void vectors(){
 vector<int> vect{ 10, 20, 30 };
 vector<int> vect2(2,500);
 vector<int> ar = { 1, 2, 3, 4, 5 };
 vector<int> vec = {2, 8, 4, 5, 10};

    for (int x : vect)
        cout << x << " ";
    cout<<endl;
    for (int x:vect2)
        cout<<x<<" ";
    cout<<endl<<vect.size();
    // Declaring iterator to a vector 
    vector<int>::iterator ptr; 
      
    // Displaying vector elements using begin() and end() 
    cout << endl<<"The vector elements are : "; 
    for (ptr = ar.begin(); ptr < ar.end(); ptr++) 
        cout << *ptr << " "; 
    
    //using auto
    cout <<endl<< "Vector elements are: ";
    for (auto it = vec.begin(); it != vec.end(); it++)
    {
        cout << *it << " ";
    }
    cout << endl;
    ar.erase(ar.begin()+1,ar.begin()+3);//[start,end)
    for(auto it:ar)
    cout<<it<<" ";
    cout<<endl;
    ar.pop_back();//dlts last element
    for(auto it:ar)
    cout<<it<<" ";
    cout<<endl;
    ar.clear();//erase entire vector
    cout<<ar.empty();//1=true
}
void listanddeque(){
    list<int> ls;
 ls.push_front(5);
 ls.emplace_front(7);
for(auto it:ls)
    cout<< it<<" ";
    cout<<endl;
deque<int> dq{1,2,4,5};
cout<<dq.front();
}
void stacks(){
    stack<int> st;
    st.push(5);
    st.push(7);
    st.push(3);
    st.emplace(4);
    cout<<st.top()<<endl;
    st.pop();
    cout<<st.top()<<endl;
}
void sets(){ //sorted and unique
    set<int> st;
    st.insert(5);
    st.emplace(6);
    st.insert(9);
    st.emplace(10);
    auto it=st.find(6);
    auto a=st.upper_bound(9);
    auto b=st.lower_bound(9);
    cout<<*it<<endl;
    cout<<*a<<endl;
    cout<<*b<<endl;
}
void multisets(){ //sorted but not unique
    multiset<int> mst;
    mst.insert(1);
    mst.insert(1);
    mst.insert(1);
    cout<<mst.count(1)<<endl;
    mst.erase(mst.find(1));
    cout<<mst.count(1)<<endl;
    mst.erase(1);
    cout<<mst.count(1)<<endl;
}
void uno_set(){
    unordered_set<int> us; //unique but unordered
    us.insert(2);
    us.insert(3);
    us.insert(9);
    us.insert(8);
    us.insert(6);
    //all functions are same like set
}
void maps(){ //similar to dictionary in python. work similar as set by storing unique and ordered key
    map<int,int> mp;
    mp[1]=4;
    mp.insert({2,6});
    for(auto it:mp){
        cout<<it.first<<" "<<it.second<<endl;
    }
    auto it=mp.find(2);
    cout<<(*it).second<<endl;
}
int main()
{ 
     return 0;
}
