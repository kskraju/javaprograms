package com.gym.javap.examples;

import java.util.LinkedList;

public class MergeLinkedList {

	static LinkedList<String> listOne;
	static LinkedList<String> listTwo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listOne = new LinkedList<String>();
		listOne.add("One");
		listOne.add("Two");
		listOne.add("Three");
		listOne.add("Four");

		listTwo = new LinkedList<String>();
		listTwo.add("A");
		listTwo.add("B");
		listTwo.add("C");
		listTwo.add("D");
		listTwo.add("E");
		listTwo.add("F");
		listTwo.add("G");

		LinkedList<String> result = new LinkedList<String>();
		int len = getBiggerSize();
		for(int i=0; i<len; i++) {
		if(!listOne.isEmpty()) {
		result.add(listOne.element());
		listOne.remove();
		}
		if(!listTwo.isEmpty()) {
		result.add(listTwo.element());
		listTwo.remove();
		}
		}
		System.out.println("List One: "+ listOne.toString());
		System.out.println("List Two: "+ listTwo.toString());
		System.out.println("List Merged: "+ result.toString());
		
	}
	
	static int getBiggerSize() {
	int result1;
	int sizeListOne = listOne.size();
	int sizeListTwo = listTwo.size();
	if(sizeListOne < sizeListTwo) {
	result1 = sizeListTwo;
	} else {
	result1 = sizeListOne;
	}
	return result1;
	}
}
