package com.hackbulgaria.programming51.week6;

public class Labirinth {

	char[][] lab = { 	{ '#', '#', '#', '#', '#', '#', '#', '#' },
						{ '#', '.', '.', '.', '.', '.', '#', '#' },
						{ '#', '.', '.', '#', '#', '.', '.', '#' },
						{ '#', '.', '.', '.', '#', '#', '.', '#' },
						{ '#', '.', '#', '.', '.', '#', '.', '#' },
						{ '#', '.', '.', '#', '.', '.', '.', '#' },
						{ '#', '#', '#', '#', '#', '!', '#', '#' } };

	public String toString() {
		String str = new String("");
		for (int i = 0; i < lab[0].length; ++i) {
			for (int j = 0; j < lab.length; ++j) {
				str += lab[i][j];
			}
		}
		return str;
	}

	public void print() {
		
	}

	public boolean movePerson(Movement move) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
