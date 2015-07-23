package com.hackbulgaria.programming51.week7;

import java.util.LinkedList;

public class Stack<T> implements StructureInterface<T> {
	private LinkedList<T> l;

	public Stack() {
		l=new LinkedList<T>();
	}

	public void push(T data) {
		l.addFirst(data);
	}

	public void pop() {
		l.removeFirst();
	}

	public int size() {
		return l.size();

	}

	public T peek() {
		return l.peek();
	}

	public boolean empty() {
		return l.isEmpty();
	}
	public String toString(){
		return l.toString();
	}

	
}
