package com.src.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseSinglyLinkedList {

	private static List<String> list = new ArrayList<String>();
	private static List<String> reversedList = new ArrayList<String>();

	public static void main(String[] args) {
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		reverseList(list);

		printList(reversedList);
	}

	public static void reverseList(List<String> listarg) {
		String firstitem = null;
		if (listarg.size() == 0) {
			return;
		} else {
			System.out.println("First "+listarg.get(0));
			firstitem = listarg.get(0);
			listarg.remove(0);
		}
		reverseList(listarg);
		System.out.println("First >>> "+firstitem);
		reversedList.add(firstitem);
	}

	public static void printList(List<String> listarg) {
		Iterator<String> listIterator = listarg.iterator();
		while (listIterator.hasNext()) {
			String item = listIterator.next();
			System.out.println(item);
		}
	}
}