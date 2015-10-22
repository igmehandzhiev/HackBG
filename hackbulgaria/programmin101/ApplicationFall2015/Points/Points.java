package com.hackbulgaria.programmin101.ApplicationFall2015.Points;

import java.util.Scanner;

public class Points {
	private int x;
	private int y;
	private static int warp;

	public static String Move(int x, int y, String s) {
		char[] directions = s.toCharArray();
		for (int i = 0; i < directions.length; ++i) {
			if (directions[i] == '~')
				warp++;
			if (warp % 2 == 0) {
				switch (directions[i]) {
				case '>': {
					x++;
					break;
				}
				case '<': {
					x--;
					break;
				}
				case '^': {
					y--;
					break;
				}
				case 'v': {
					y++;
					break;
				}
				}
			}
			if (warp % 2 == 1) {
				switch (directions[i]) {
				case '>': {
					x--;
					break;
				}
				case '<': {
					x++;
					break;
				}
				case '^': {
					x++;
					break;
				}
				case 'v': {
					x--;
					break;
				}
				}
			}
		}
		String str = "(" + x + ", " + y + " )";
		return str;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println(Move(0, 0, ">>><<<~>>>~^^^"));
	}
}
