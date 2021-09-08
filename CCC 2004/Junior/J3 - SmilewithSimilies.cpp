#include <iostream>

using namespace std;
int main() {
    int n;
    int m;
    cin >> n;
    cin >> m;
    string adjective;
    string noun;
    string nouns[5] = {""};
    string adjectives[5] = {""};

    for(int i = 0; i < n; i++){
        cin >> adjective;
        adjectives[i] = adjective;
    }
    for(int i = 0; i < m; i++){
        cin >> noun;
        nouns[i] = noun;
    }
    for(int i = 0; i < n; i++){
        for(int b = 0; b < m; b++){
            cout << adjectives[i] << " as " << nouns[b] << "\n";
        }
    }
    return 0;
}
