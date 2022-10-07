#include <cstddef>
#include <iostream>
#include <string>

using namespace std;

int edit_distance(const string &str1, const string &str2) {
	int distances[str1.size() + 1][str2.size() + 1];
	int ind = 0;
	while (ind <= str1.size()) {
		distances[ind][0] = ind;
		ind++;
	}
	ind = 1;
	while (ind <= str2.size()) {
		distances[0][ind] = ind;
		ind++;
	}
	for (size_t i = 1; i <= str1.size(); i++) {
		for (size_t j = 1; j <= str2.size(); j++) {
			if (str1[i - 1] != str2[j - 1]) {
				distances[i][j] = min(
					1 + distances[i - 1][j],
					min(1 + distances[i][j - 1], 1 + distances[i - 1][j - 1]));
			} else {
				distances[i][j] = distances[i - 1][j - 1];
			}
		}
	}
	return distances[str1.size()][str2.size()];
}

int main() {
	string str1;
	string str2;
	cin >> str1 >> str2;
	cout << edit_distance(str1, str2) << endl;
	return 0;
}