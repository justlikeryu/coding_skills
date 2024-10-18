#include <iostream>

using namespace std;

int main(void) {
	int T;

	cin >> T;

	int A, B;

	for (int i = 1; i <= T; i++) {
		cin >> A >> B;
        
		printf("Case #%d: %d + %d = %d\n", i, A, B, A + B);
	}

	return 0;
}