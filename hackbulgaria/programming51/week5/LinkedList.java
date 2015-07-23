package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	int size = 0;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public T getFirst() {
		return head.getData();
	}

	public T getLast() {
		return tail.getData();
	}

	public void addLast(T data) {
		Node<T> temp = new Node<>(data);
		if (head == null) {
			head = temp;
		} else {
			tail.setNext(temp);
		}
		tail = temp;
		size++;
	}

	public void addFirst(T data) {
		Node<T> temp = new Node<>(data);
		temp.setNext(head);
		head = temp;
		size++;
	}

	public void add(T data) {
		if (head == null) {
			Node<T> temp = new Node<>(data);
			head = temp;
			tail = temp;
			size++;
		} else
			addLast(data);
	}

	public String toString() {
		String str = "";
		Node<T> temp = head;
		str += "[";
		str += temp.getData();
		while (temp.getNext() != null) {
			temp = temp.getNext();
			str += "," + temp.getData();
		}
		str += "]";
		return str;
	}

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public T get(int index) {
		return find(index).getData();
	}

	public void set(int index, T el) {
		find(index).setData(el);
	}

	public void setNext(int index, Node<T> el) {
		find(index).setNext(el);
	}

	public Node<T> find(int index) {
		Node<T> temp = head;
		int counter = 0;
		while (true) {
			if (counter == index) {
				return temp;
			} else {
				temp = temp.getNext();
				counter++;
			}
		}
	}

	public int size() {
		return size;
	}

	public void insertAfter(int index, T data) {
		Node<T> temp = new Node<>(data);
		temp.setNext(find(index).getNext());
		find(index).setNext(temp);
	}

	public void remove(int index) {
		if (index == 0) {
			head = find(index).getNext();
		} else {
			find(index - 1).setNext(find(index + 1));
		}
	}

	public boolean contains(T data) {
		Node<T> temp = head;
		while (temp.getNext() != null) {
			if (temp.getData().equals(data)) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	public T[] toArray() {
		// Returns an array with all the elements in the list
		Node<T> temp = head;
		@SuppressWarnings("unchecked")
		T[] arr = (T[]) new Object[size()];
		for (int i = 0; i < size(); ++i) {
			arr[i] = temp.getData();
			temp = temp.getNext();
		}
		return arr;
	}

	public void addArray(T[] arr) {
		// Appends the array at the end of the list
		for (int i = 0; i < arr.length; ++i) {
			Node<T> temp = new Node<>(arr[i]);
			if (head == null) {
				head = temp;
			} else {
				tail.setNext(temp);
			}
			tail = temp;
			size++;
		}

	}

	private LinkedList<T> copy(LinkedList<T> l) {
		LinkedList<T> copied = new LinkedList<T>();
		if (head == null)
			return copied;
		Node<T> temp = l.head;
		while (temp.getNext() != null) {
			copied.add(temp.getData());
			temp = temp.getNext();
		}
		copied.add(temp.getData());
		return copied;
	}

	public void insertListAfter(int index, LinkedList<T> l) {
		// Inserts all the elements of l after the index element
		l = copy(l);
		if (index == size - 1) {
			tail.setNext(l.head);
			tail = l.tail;
		} else {
			Node<T> temp = find(index);
			// System.out.println(find(index+1).getData());
			l.getTail().setNext(temp.getNext());
			// System.out.println(find(index).getData());
			temp.setNext(l.getHead());
		}
		size += l.size;
	}

	public void insertListBefore(int index, LinkedList<T> l) {
		// Inserts all the elements of l before the index element
		l = copy(l);
		if (index == 0) {
			l.tail.setNext(head);
			head = l.head;
			size += l.size;
		} else {
			insertListAfter(index - 1, l);
		}
	}

	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		Integer[] arr;
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			list1.addLast(scanner.nextInt());
		}
		n = scanner.nextInt();
		arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		list2.addArray(arr);
		list1.insertListBefore(0, list2);
		System.out.println(list1);
		list1.insertListAfter(0, list2);
		System.out.println(list1);

	}

}
