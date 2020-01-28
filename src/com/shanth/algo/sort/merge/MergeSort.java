package com.shanth.algo.sort.merge;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = new int[]{ 1, 3, 4, 2, 5, 8, 7, 9, 12, 10 };

		MergeSort mgs = new MergeSort();
		mgs.sort(arr, 0, arr.length - 1);
		mgs.print(arr);

	}

	private void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+ " ");
		}
	}

	public void sort(int[] arr, int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);

		}
	}

	private void merge(int[] arr, int low, int mid, int high) {

		int m = mid - low + 1;
		int n = high - mid;

		int[] A = new int[m];
		int[] B = new int[n];

		for (int i = 0; i < m; i++) {
			A[i] = arr[low + i];

		}
		for (int j = 0; j < n; j++) {
			B[j] = arr[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = low;

		while (i < m && j < n) {

			if (A[i] < B[j]) {
				arr[k] = A[i];
				k++;
				i++;
			} else {
				arr[k] = B[j];
				k++;
				j++;
			}

		}
		while (i < m) {

			arr[k] = A[i];
			k++;
			i++;
		}

		while (j < n) {
			arr[k] = B[j];
			k++;
			j++;
		}

	}

}
