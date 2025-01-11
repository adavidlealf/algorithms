#include <bits/stdc++.h>

#define nl "\n"
#define fore(i,a,b) for (int i = a; i < b; i++)

using namespace std;

int main() {
    int t; cin>>t;
    while(t--){
        int n; cin>>n;
        cout << ((n % 5 == 0 ? n/5 : ((n/5)+1) )) << nl;
    }
}