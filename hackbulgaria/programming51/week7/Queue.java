package com.hackbulgaria.programming51.week7;

public class Queue<T> implements StructureInterface<T> {
	private Node<T> head;
	private Node<T> tail;

	public Queue() {
		head = null;
		tail = null;
	}

	@Override
	public void push(T data) {
		if (empty()) {
			head = new Node<T>(data);
			tail = head;
		} else {
			tail.setNext(new Node<>(data));
			tail = tail.getNext();
		}
	}

	@Override
	public void pop() {
		head.getNext();
	}

	@Override
	public int size() {
		int size = 0;
		while (tail != null) {
			Node<T> temp = head;
			temp = temp.getNext();
			size++;
		}
		return size;
	}

	@Override
	public T peek() {
		if (empty())
			return null;
		return head.getData();
	}

	@Override
	public boolean empty() {
		return head == null;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public String toString() {
		String str = "[";
		Node<T> temp = head;
		if (empty())
			return "[]";
		while (temp.getNext() != null) {
			str += temp.getData() + ", ";
			temp = temp.getNext();
		}
		return str + temp.getData() + "]";
	}

	public Queue<T> copy() {
		Queue<T> q = new Queue<>();
		Node<T> tempNode = head;
		while (tempNode != null) {
			q.push(tempNode.getData());
			tempNode = tempNode.getNext();
		}
		return q;

	}
}
