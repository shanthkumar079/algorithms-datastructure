package com.shanth.algo.arrays;

public class Rotation {

	public static void main(String[] args) {

		Rotation rt = new Rotation();
		// int[] c = rt.rotate(25231, );
		// rt.print(c);
		int[] c = rt.createArray(90498);
		int[] d = rt.rotate(25231,c);
		rt.print(d); 
		
/*		int[] c = rt.createArray(20);
		int[] d = rt.rotate(4,c);
		rt.print(d);*/

	}

	public int[] createArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
		return a;
	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}
	}

	public void rotate(int[] a, int d) {
		System.out.println("D::" + d);
		if (d == 0) {
			return;
		} else {
			int tmp = a[0];
			int i;
			for (i = 0; i < a.length - 1; i++) {

				a[i] = a[i + 1];
			}
			a[i] = tmp;
			rotate(a, d - 1);
		}
	}

	public int[] rotate(int d, int[] a) {
		int[] b = new int[a.length];
		//System.out.println(a.length);
		int j = 0;
		for (int i = d; i < a.length; i++) {
			b[j] = a[i];
			j++;
		}
		for (int i = 0; i < d; i++) {
			b[j] = a[i];
			j++;
		}
		return b;
	}
}
