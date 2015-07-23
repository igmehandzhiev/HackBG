package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class Anagrams {

	public static boolean areAnagrams(String a, String b) {
		int ana = 0;
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); ++i) {
				for (int j = 0; j < b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						ana++;
						break;
					}
				}
			}
		}
		if (ana == a.length())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();

		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
	}
}