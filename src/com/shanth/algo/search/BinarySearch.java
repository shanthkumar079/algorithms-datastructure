package com.shanth.algo.search;

public class BinarySearch {

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int x = bs.binarySearch(arr, 0, arr.length - 1, 9);
		System.out.println(x);

	}

	public int binarySearch(int[] arr, int low, int high, int key) {

		if (low < high) {

			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (key < arr[mid]) {
				return binarySearch(arr, low, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, high, key);
			}
		}
		return -1;

	}
}
