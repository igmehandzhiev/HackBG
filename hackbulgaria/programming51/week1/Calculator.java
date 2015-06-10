package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    int a = scanner.nextInt();
		    char oper = scanner.next().charAt(0);
		    int b = scanner.nextInt();

		    System.out.println(a);
		    System.out.println(oper);
		    System.out.println(b);
		   
		    switch (oper){
		    case '+': System.out.println(a+b);
		    			break;
		    case '-': System.out.println(a-b);
			break;
		    case '*': System.out.println(a*b);
			break;
		    case '/': System.out.println(a/b);
			break;
		    case '^': System.out.println(Math.pow(a, b));
			break;
		    case '?': int af=a,bf=b;
		    for(int i=2;i<a;++i){
		    	af*=i;
		    }
		    for(int i=2;i<b;++i){
		    	bf*=i;
		    }
		    System.out.println(af+bf);
			break;


		    }

	}

}
