#include <bits/stdc++.h>

#define nl "\n"

using namespace std;

int main() {
    string s; cin>>s;
    size_t lastIndice = 0;
    bool helloFound = true;
    string hello = "hello";
    for(char letra : hello){
        lastIndice = s.find(letra,lastIndice);
        if(lastIndice == string::npos) {
            helloFound = false;
            break;
        }
        lastIndice++;
    }
    cout << (helloFound? "YES" : "NO") << nl;
}