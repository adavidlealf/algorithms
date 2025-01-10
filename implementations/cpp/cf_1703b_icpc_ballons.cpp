#include <bits/stdc++.h>

#define nl "\n"
#define fore(i,a,b) for (int i = a; i < b; i++)

using namespace std;

int main() {
    int t; cin>>t;
    while(t--){
        int n; cin>>n;
        string s; cin>>s;
        unordered_set<char> letras;
        fore(i,0,n){
            letras.insert(s[i]);
        }
        cout<<(n+letras.size())<<nl;
    }
}