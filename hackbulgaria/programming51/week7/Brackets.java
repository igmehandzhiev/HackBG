package com.hackbulgaria.programming51.week7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Brackets {
	public static boolean areCorrect(String brackets) {
		Queue<Character> ch = new LinkedList<>();
		for (int i = 0; i < brackets.length(); ++i) { // String to Opashka
			ch.add(brackets.charAt(i));
		}
		Character temp = ch.peek();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String brackets = scanner.next();
		System.out.println(Brackets.areCorrect(brackets));
	}
}
