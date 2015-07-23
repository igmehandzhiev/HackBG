package com.hackbulgaria.programming51.week7;
public class Main {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		Queue<Integer> q = new Queue<>();
		for (int i = 0; i < 20; ++i) {
			q.push(i);
			s.push(i);
		}
		System.out.println(q);
		System.out.println(s);
	}
	

}
