package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class StaticLinkedList {
	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		int cnt = 0;
		for (int i = l.size() - 1; i > (l.size()) / 2; --i) {
			int temp = l.get(cnt);
			l.set(cnt, l.get(i));
			l.set(i, temp);
			cnt++;
		}
		return l;
	}

	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		for (int i = 0; i < l.size(); ++i) {
			int max = l.get(i);
			for (int j = 0; j < l.size(); ++j) {
				if (l.get(i) > l.get(j)) {
					max = l.get(j);
					l.set(j, l.get(i));
					l.set(i, max);
				}
			}
		}
		return l;
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		// Merges a and b into one sorted list
		LinkedList<Integer> merged = new LinkedList<>();
		copy(merged, a);
		copy(merged, b);
		sort(merged);
		return merged;
	}

	public static LinkedList<Integer> copy(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		for (int i = 0; i < b.size; ++i) {
			a.add(b.get(i));
		}
		return a;
	}

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		LinkedList<Integer> secondL = new LinkedList<>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			l.add(scanner.nextInt());
		}
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			secondL.add(scanner.nextInt());
		}

		System.out.println(StaticLinkedList.reverse(l));
		System.out.println(StaticLinkedList.sort(l));
		System.out.println(StaticLinkedList.merge(l, secondL));
	}

}
