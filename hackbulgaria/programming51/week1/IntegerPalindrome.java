package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int Num = input;
		int reversedNum = 0;
		int reversedSum = 0;
		int last_digit;
		while (input != 0) {
			last_digit = input % 10;
			reversedNum = reversedNum * 10 + last_digit;
			input = input / 10;
		}
		int Sum = Num + reversedNum;
		int nSum=Sum;
		while (Sum != 0) {
			last_digit = Sum % 10;
			reversedSum = reversedSum * 10 + last_digit;
			Sum = Sum / 10;
		}
		System.out.println(reversedSum);
		System.out.println(nSum);
		if (nSum == reversedSum)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
