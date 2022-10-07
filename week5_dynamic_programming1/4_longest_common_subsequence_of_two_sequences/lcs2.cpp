#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

using std::max;
using std::vector;

int lcs2(vector<int> &a, vector<int> &b) {
	int sequence[a.size() + 1][b.size() + 1];
	int ind = 0;
	while (ind <= a.size()) {
		sequence[ind][0] = 0;
		ind++;
	}
	ind = 1;
	while (ind <= b.size()) {
		sequence[0][ind] = 0;
		ind++;
	}
	for (size_t i = 1; i <= a.size(); i++) {
		for (size_t j = 1; j <= b.size(); j++) {
			if (a.at(i - 1) == b.at(j - 1)) {
				sequence[i][j] = 1 + sequence[i - 1][j - 1];
			} else {
				sequence[i][j] = max(sequence[i - 1][j], sequence[i][j - 1]);
			}
		}
	}
	return sequence[a.size()][b.size()];
}

int main() {
	size_t n;
	cin >> n;
	vector<int> a(n);
	for (size_t i = 0; i < n; i++){
		cin >> a[i];
	}

	size_t m;
	cin >> m;
	vector<int> b(m);
	for (size_t i = 0; i < m; i++)
	{
		cin >> b[i];
	}

	cout << lcs2(a, b) << endl;
}