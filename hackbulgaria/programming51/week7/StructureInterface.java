package com.hackbulgaria.programming51.week7;

public interface StructureInterface<T> {
	public void push(T data);
	public void pop();
	public int size();
	public T peek();
	public boolean empty();
}
