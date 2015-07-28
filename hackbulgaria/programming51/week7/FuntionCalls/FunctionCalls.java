package com.hackbulgaria.programming51.week7.FuntionCalls;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class FunctionCalls {
	public static Vector<Functions> functions = new Vector<>();

	public static void addF(String s) {
		String[] spl = s.split(" ");
		Functions f = new Functions(spl[0], spl[1], s.split("= "));
		functions.addElement(f);
	}

	public static int evaluate(String s, int x) {
		int result = x;
		String[] f = s.split(" \\. ");
		Stack<String> st = new Stack<>();
		for (String str : f) {
			st.push(str);
		}
		for (int i = 0; i < f.length; ++i) {
			for (Functions func : functions) {
				if (!(st.isEmpty())) {
				if (st.peek().equals(func.getName())) {
						result = func.result(result);
						st.pop();
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int nFunctions = in.nextInt();
		in.nextLine();
		for (int i = 0; i < nFunctions; ++i) {
			String str = in.nextLine();
			addF(str);
		}
		String composition = in.nextLine();
		int x = in.nextInt();
		in.nextLine();
		System.out.println(evaluate(composition, x));

	}
}
