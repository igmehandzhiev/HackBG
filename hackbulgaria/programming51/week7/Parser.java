package com.hackbulgaria.programming51.week7;

import java.util.Scanner;
import java.util.Stack;

public class Parser {

	public static int f1(int x) {
		return f2(x) + f3(x);
	}

	public static int f2(int x) {
		return 2 * x;
	}

	public static int f3(int x) {
		return x + 1;
	}

	public static int f4(int x) {
		return 2 * f1(x);
	}

	public static int evaluate(String formula, int x) {
		int result = x;
		String[] f = formula.split(" \\. ");
		Stack<String> st = new Stack<>();
		for (int i = 0; i < f.length; ++i) {
			st.push(f[i]);
		}
		for (int i = 0; i < f.length; ++i) {
			switch (st.peek()) {
			case "f1": {
				result = f1(result);
				st.pop();
				break;
			}
			case "f2": {
				result = f2(result);
				st.pop();
				break;
			}
			case "f3": {
				result = f3(result);
				st.pop();
				break;
			}
			case "f4": {
				result = f4(result);
				st.pop();
				break;
			}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int x = scanner.nextInt();

		System.out.println(evaluate(input, x));
	}
}
