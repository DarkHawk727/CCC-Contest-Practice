#include <iostream>

using namespace std;
int main() {
    int X;
    int Y;
    cout << "Enter the current year: ";
    cin >> X;
    cout << "Enter a future year: ";
    cin >> Y;
    for(int i = X; i <= Y; i++){
        // 60 is the LCM of 2,3,4,5.
        if((i-X) % 60 == 0){
            cout << "All positions change in year " << i <<"\n";
        }
    }
    return 0;
}
