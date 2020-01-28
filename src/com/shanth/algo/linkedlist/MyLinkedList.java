package com.shanth.algo.linkedlist;

public class MyLinkedList<T> {

	private Node<T> head;

	public class Node<T> {

		public Node next;

		T data;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(T data) {

		Node<T> new_node = new Node<T>(data);
		if (head == null) {
			head = new_node;
		} else {
			Node<T> curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = new_node;
		}

	}

	public void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();

	}

	public Node<T> getNthNode(int n) {

		Node<T> fstPtr = head;
		Node<T> slwPtr = head;

		int i = 0;
		while (fstPtr.next != null && i < n) {
			fstPtr = fstPtr.next;
			i++;
		}
		while (fstPtr != null && slwPtr.next != null) {
			fstPtr = fstPtr.next;
			slwPtr = slwPtr.next;
		}
		return slwPtr;

	}
}
