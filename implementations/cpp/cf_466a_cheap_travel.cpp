#include <bits/stdc++.h>

using namespace std;

int main() {
    int n,m,a,b,x;
    cin>>n>>m>>a>>b;
    if(n%m==0){
        x = ((n/m)*b < n*a ? (n/m)*b : n*a);
    } else {
        x = (((n/m)+1)*b < ((n/m)*b)+((n%m)*a) ? ((n/m)+1)*b : ((n/m)*b)+((n%m)*a));
    }
    cout<<x<<"\n";
}