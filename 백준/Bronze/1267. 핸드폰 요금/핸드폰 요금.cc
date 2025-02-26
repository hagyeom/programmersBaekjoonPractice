#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> callTimes(N);
    for (int i = 0; i < N; ++i) {
        cin >> callTimes[i];
    }

    int yCost = 0, mCost = 0;
    for (int i = 0; i < N; ++i) {
        yCost += (callTimes[i] / 30 + 1) * 10;
        mCost += (callTimes[i] / 60 + 1) * 15;
    }

    if (yCost < mCost) {
        cout << "Y " << yCost << endl;
    } else if (yCost > mCost) {
        cout << "M " << mCost << endl;
    } else {
        cout << "Y M " << yCost << endl;
    }

    return 0;
}
