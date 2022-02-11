package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		new SelectionSort().sortArray();

		int[] arr = { 5, 6, 5, 2, 8, 4, 7, 9, 6, 3, 0, 7, 1, 3 };
	}

	void insertion_sort(int A[], int n) {
		for (int i = 0; i < n; i++) {

			int temp = A[i];
			int j = i;

			while (j > 0 && temp < A[j - 1]) {

				A[j] = A[j - 1];
				j = j - 1;

			}
			A[j] = temp;
		}
	}
}