#include <algorithm>
#include <iostream>
#include <numeric>
#include <vector>
using namespace std;

bool search(const vector<long long>& A, int index,
					  vector<long long>& partitions, long long target) {
	if (index >= A.size()){
		return true;
	} 
	for (size_t i = 0; i < partitions.size(); i++) {
		if (partitions[i] + A.at(index) <= target) {
			partitions[i] += A.at(index);
			if (search(A, index + 1, partitions, target)) {
				return true;
			}
			partitions[i] -= A.at(index);
		}
	}
	return false;
}

bool helper(vector<long long>& A) {
	long long n = accumulate(A.begin(), A.end(), 0);
	if (n % 3 != 0 or A.size() < 3 or
		*max_element(A.begin(), A.end()) > n / 3) {
		return false;
	}

	sort(A.begin(), A.end());
	reverse(A.begin(), A.end());
	vector<long long> partitions(3, 0);
	return search(A, 0, partitions, n / 3);
}

int main() {
	int n;
	cin >> n;
	vector<long long> A(n);
	for (size_t i = 0; i < A.size(); ++i){ 
		cin >> A[i]; 
	}
	cout << helper(A) << '\n';
}
