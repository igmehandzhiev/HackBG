package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class StringNormalizer {

	public static String normalizeString(String s) {
		Vector<String> res = new Vector<String>();
		String[] words = s.split(" ");
		for (String word : words) {
			if (word.length() != 0) {
				String str = Character.toUpperCase(word.charAt(0))
						+ word.substring(1).toLowerCase();
				res.add(str);
			}
		}
		return String.join(" ", res);
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		System.out.println(normalizeString(s));
	}
}
