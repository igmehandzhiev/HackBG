package com.hackbulgaria.programming51.week7;
import java.util.Scanner;

public class Brackets {
	public static boolean areCorrect(String brackets) {
		int result=0;
		char[] ch=brackets.toCharArray();
		for(int i=0;i<brackets.length();++i){
			for(int j=brackets.length()-1;j>i;--j){
				char iC=ch[i];
				char jC=ch[j];
				if(iC=='('&&jC==')')result=j-i-1;
				if(iC=='['&&jC==']')result=j-i-1;
				if(iC=='{'&&jC=='}')result=j-i-1;
				if (result%2!=0)return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String brackets = scanner.next();
		System.out.println(Brackets.areCorrect(brackets));
	}
}
