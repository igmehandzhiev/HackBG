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
		return join(" ", res);
	}

	public static String join(String glue, Vector<String> a) {
		String string4e = new String();
		for (int i = 0; i < a.size(); ++i) {
			string4e += a.get(i) + glue;
		}
		string4e = string4e.substring(0, string4e.length() - 1);
		return string4e;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		System.out.println(normalizeString(s));
	}
}
