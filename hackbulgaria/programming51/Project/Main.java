package com.hackbulgaria.programming51.Project;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 11;
		int y = 11;
		SymLab l = new SymLab();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; ++i) {
			String ch = s.nextLine();
			l.moveUP(x, y, ch);
			x--;

			System.out.println(l);
		}
	}

}
