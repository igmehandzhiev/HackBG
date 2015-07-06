package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class VectorOfVectors {

	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
		Vector<Integer> result = new Vector<Integer>();
		for (Vector<Integer> vecInt : v) {
			for (Integer i : vecInt) {
				if (!result.contains(i))
					result.add(i);
			}
		}
		result.sort(null);
		return result;
	}

	public static void main(String[] args) {

		Vector<Vector<Integer>> vi = new Vector<Vector<Integer>>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Vector<Integer> v = new Vector<Integer>();
			int num = scanner.nextInt();
			for (int k = 0; k < num; k++) {
				v.add(scanner.nextInt());
			}
			vi.add(v);
		}
		System.out.println(sortAndUnique(vi));
	}

}
