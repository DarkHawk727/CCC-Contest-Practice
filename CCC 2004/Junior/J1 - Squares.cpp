#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int tiles;
    cin >> tiles;
    int ans = pow(tiles,0.5);
    cout << "The largest square has side length " <<  ans << ".";
    return 0;
}
