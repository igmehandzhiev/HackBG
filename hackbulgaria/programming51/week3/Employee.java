package com.hackbulgaria.programming51.week3;

public class Employee {
	private String name;
	public static int count=0;
	
	public Employee(String name){
		this.name=name;
		count++;
	}
	
	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}
	
	public static int count(){
		return count;
	}
}
