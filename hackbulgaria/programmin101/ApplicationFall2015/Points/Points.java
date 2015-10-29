package com.hackbulgaria.programmin101.ApplicationFall2015.Points;

import java.util.Scanner;

public class Points {
	private int x;
	private int y;
	private static int warp = 1;

	public static String Move(int x, int y, String s) {
		char[] directions = s.toCharArray();
		for (int i = 0; i < directions.length; ++i) {
			if (directions[i] == '~')
				warp *= -1;

			switch (directions[i]) {
			case '>': {
				x += warp;
				break;
			}
			case '<': {
				x -= warp;
				break;
			}
			case '^': {
				y -= warp;
				break;
			}
			case 'v': {
				y += warp;
				break;
			}
			}
		}

		String str = "(" + x + ", " + y + " )";
		return str;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println(Move(0, 0, ">>><<~~>>>^^^"));
	}
}
