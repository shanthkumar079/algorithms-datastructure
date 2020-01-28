package com.shanth.algo.linkedlist;

import java.io.IOException;
import java.sql.SQLException;

import com.shanth.algo.linkedlist.MyLinkedList.Node;

public class Demo {

	public static void main(String[] args) {

		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.display();
		Node node = list.getNthNode(5);
		System.out.println(node.data);
	}
	
	
}
