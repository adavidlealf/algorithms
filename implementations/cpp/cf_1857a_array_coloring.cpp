#include <bits/stdc++.h>

#define nl "\n"
#define fore(i,a,b) for (int i = a; i < b; i++)

using namespace std;

int main() {
    int t; cin>>t;
    while(t--){
        int n; cin>>n;
        int suma = 0;
        int temp;
        fore(i, 0, n){
            cin>>temp;
            suma += temp;
        }
        cout <<( suma%2==0 ? "YES" : "NO") <<nl;
    }
}