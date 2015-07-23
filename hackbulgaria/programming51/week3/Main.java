package com.hackbulgaria.programming51.week3;
public class Main {

	public static void main(String[] args) {
		int [] a1={1,3,9,1,5,4};
		System.out.println(Arr.toString(a1));
		Arr.sort(a1);
		System.out.println(Arr.toString(a1));
		Arr.reverse(a1);
		System.out.println(Arr.toString(a1));
		System.out.println(Arr.join(a1, ": "));
		System.out.println(Arr.join(a1, "->"));
		System.out.println(Arr.sum(a1));
		int [] a2 = Arr.range(10, 20);
		System.out.println(Arr.join(a2, ", "));
		int [] a3 = {2,3,4,8,9,11,13,15};
		int [] temp = Arr.filterOdd(a3);
		System.out.println(Arr.join(temp, ", "));
		
	}

}
