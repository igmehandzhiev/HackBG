package com.hackbulgaria.programmin101.ApplicationFall2015.WordGame;


import java.util.Scanner;

public class WordGame {
	static int m;
	static int n;

	public static int Result(char[][] map, String search) {
		int counter = 0;
		int a = n - search.length();
		int b = m - search.length();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (map[i][j] == search.charAt(0)) {
					if (j <= b) {
						if (right(map, search, i, j))
							counter++;
						if (i <= a)
							if (downRight(map, search, i, j))
								counter++;
					}
					if (i <= a) {
						if (down(map, search, i, j))
							counter++;
						if (j >= search.length() - 1)
							if (downLeft(map, search, i, j))
								counter++;
					}
					if (j >= search.length() - 1) {

						if (left(map, search, i, j))
							counter++;
						if (i >= search.length() - 1)
							if (upLeft(map, search, i, j))
								counter++;
					}
					if (i >= search.length() - 1) {
						if (up(map, search, i, j))
							counter++;
						if (j <= b)
							if (upRight(map, search, i, j))
								counter++;
					}
				}
			}
		}
		int isMirror=0;
		int j=search.length()-1;
		for(int i=0;i<(search.length())/2;++i){
			if(search.charAt(i)==search.charAt(j))isMirror=1;
			--j;
		}
		if(isMirror==1)counter=counter/2;
		return counter;
	}

	public static boolean right(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i][j + 1] == search.charAt(m)) {
				++j;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static boolean downRight(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i + 1][j + 1] == search.charAt(m)) {
				++j;
				++i;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static boolean down(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i + 1][j] == search.charAt(m)) {
				++i;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static boolean downLeft(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i + 1][j - 1] == search.charAt(m)) {
				--j;
				++i;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static boolean left(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i][j - 1] == search.charAt(m)) {
				--j;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static boolean upLeft(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i - 1][j - 1] == search.charAt(m)) {
				--j;
				--i;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static boolean up(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i-1][j] == search.charAt(m)) {
				--i;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static boolean upRight(char[][] map, String search, int i, int j) {
		int m = 1;
		while (m < search.length()) {
			if (map[i - 1][j + 1] == search.charAt(m)) {
				++j;
				--i;
				++m;
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String searched = scanner.next();
		char[][] map;
		n = scanner.nextInt();
		m = scanner.nextInt();
		map = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scanner.next().charAt(0);
			}
		}
		System.out.println(Result(map, searched));
		// Print result here
	}
}
