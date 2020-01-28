package com.shanth.algo.arrays;

public class Sparse {

	public static void main(String[] args) {

		String[] strs = { "ab", "ab", "abc" };
		String[] queries = { "ab", "abc", "bc" };

		Sparse sparse = new Sparse();
		int[] results = sparse.results(strs, queries);
		for (int i : results) {

			System.out.println(i + " ");
		}

	}

	public int[] results(String[] strs, String[] queries) {
		int[] results = new int[queries.length];
		int i = 0;
		for (String query : queries) {
			int count = 0;
			for (String str : strs) {
				if (query.equalsIgnoreCase(str)) {
					count++;
				}
			}
			results[i] = count;
			i++;
		}

		return results;

	}
}
