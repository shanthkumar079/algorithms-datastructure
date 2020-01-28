package com.shanth.algo.sort.quick;

import com.shanth.algo.sort.merge.MergeSort;

public class Quicksort {

	public static void main(String[] args) {

		int[] arr = new int[] { 96, 97, 99, 14, 1, 3, 102, 4, 2, 5, 8, 7, 9, 12, 10, 13, 88 };
		int[] brr = new int[] { 19, 15 };

		Quicksort mgs = new Quicksort();
		mgs.sort(arr, 0, arr.length - 1);
		mgs.print(arr);
		mgs.sort(brr, 0, brr.length - 1);
		mgs.print(brr);
	}

	public void sort(int[] arr, int low, int high) {

		if (low < high) {
			int pivot = partition(arr, low, high);
			sort(arr, low, pivot);
			sort(arr, pivot + 1, high);

		}

	}

	private void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while (i < j) {
			while (i < high && pivot > arr[i]) {
				i++;
			}
			while (j > low && pivot < arr[j]) {
				j--;
			}
			if (i < j) {

				swap(arr, i, j);
			}

		}
		swap(arr, i, j);
		return j;

	}

	private void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

	}
}
