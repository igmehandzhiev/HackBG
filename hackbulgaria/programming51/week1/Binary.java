package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(toBinary(a));
		scanner.close();
		System.out.println("BINARY: " + toNumber(toBinary(a)));
		System.out.println("BITS: " + countBits(a));
		System.out.println("IsPOWER: "+ isPowerOfTwo(toBinary(a)));

	}

	public static String toBinary(int n) {
		String madafaka = "";
		int bin = 0;
		while (n >= 1) {
			if (n % 2 == 0)
				bin = 0;
			else
				bin = 1;
			madafaka += bin;
			n = n / 2;
		}
		String Reversed = new StringBuffer(madafaka).reverse().toString();
		return Reversed;
	}

	public static int toNumber(String binary) {
		String revBin = new StringBuffer(binary).reverse().toString();
		int result = 0;
		for (int i = binary.length() - 1; i >= 0; --i) {
			if (revBin.charAt(i) == '1')
				result += (Math.pow(2, i));
		}
		return result;
	}

	public static int countBits(int n) {
		return toBinary(n).length();

	}

	public static boolean isPowerOfTwo(String binary) {
		boolean is = false;
		int temp=toNumber(binary);
		for (int i = 0; temp >= 1; temp=temp / 2) {
			if (toNumber(binary) % 2 == 0)
				is = true;
			else
				is = false;
		}
		return is;
	}

}
