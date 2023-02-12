

#include <bits/stdc++.h>
using namespace std;

void palindrome(int arr[], int n)
{
	// Initialise flag to zero.
	int flag = 0;

	// Create another array
	// to store the original array
	int arr2[n];
	memcpy(arr2, arr, n * sizeof(int));

	// Reverse the array
	reverse(arr, arr + n);

	// Check if the array is Palindrome
	for (int i = 0; i < n; i++)
		if (arr[i] != arr2[i]) {
			flag = 1;
			break;
		}

	
	if (flag == 0)
		cout << "Palindrome\n";
	else
		cout << "Not Palindrome\n";
}

int main()
{

	int arr[] = { 1, 2, 3, 2, 1 };

	// Compute the size
	int n = sizeof(arr) / sizeof(arr[0]);

	palindrome(arr, n);

	return 0;
}
