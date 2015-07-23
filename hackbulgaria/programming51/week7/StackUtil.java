package com.hackbulgaria.programming51.week7;

public class StackUtil {
	public static String reversedStringLetter(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); ++i) {
			st.push(s.charAt(i));
		}
		return st.toString();

	}

	public static String reversedStringWord(String s) {
		String[] temp =new String[s.length()];
		temp=s.split(" ");
		Stack<String> st=new Stack<>();
		for (int i = temp.length-1; i >= 0; --i) {
			st.push(temp.toString());
		}
		return st.toString();
	}

	public static void main(String[] args) {
		String s=new String( "glupakk si ti ");
		System.out.println(StackUtil.reversedStringLetter(s));
		System.out.println(StackUtil.reversedStringWord(s));
	}
}

