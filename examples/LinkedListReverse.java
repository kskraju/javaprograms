package com.gym.javap.examples;

public class LinkedListReverse{  
	  
	 private Node head;  
	  
	 private static class Node {  
	  private int value;  
	  private Node next;  
	  
	  Node(int value) {  
	   this.value = value;  
	  
	  }  
	 }  
	  
	 public void addToTheLast(Node node) {  
	  
	  if (head == null) {  
	   head = node;  
	  } else {  
	   Node temp = head;  
	   while (temp.next != null)  
	    temp = temp.next;  
	  
	   temp.next = node;  
	  }  
	 }  
	  
	  
	 public void printList(Node head) {  
	  Node temp = head;  
	  while (temp != null) {  
	   System.out.format("%d ", temp.value);  
	   temp = temp.next;  
	  }  
	  System.out.println();  
	 }  
	  
	 // Reverse linkedlist using this function   
	public static Node reverseLinkedList(Node currentNode)  
	 {  
	// For first node, previousNode will be null  
	Node previousNode=null;  
	  Node nextNode;  
	  while(currentNode!=null)  
	  {  
	   nextNode=currentNode.next;  
	  // reversing the link  
	   currentNode.next=previousNode;  
	  // moving currentNode and previousNode by 1 node  
	   previousNode=currentNode;  
	   currentNode=nextNode;  
	  }  
	  return previousNode;  
	 }  
	  
	public static Node reverseLinkedListRecursive(Node node) {  
	     if (node == null || node.next == null) {  
	         return node;  
	     }  
	  
	     Node remaining = reverseLinkedListRecursive(node.next);  
	     node.next.next = node;  
	     node.next = null;  
	    return remaining;  
	 }  

	public static void main(String[] args) {  
      LinkedListReverse list = new LinkedListReverse();  
	  // Creating a linked list  
	  Node head=new Node(5);  
	  list.addToTheLast(head);  
	  list.addToTheLast(new Node(6));  
	  list.addToTheLast(new Node(7));  
	  list.addToTheLast(new Node(1));  
	  list.addToTheLast(new Node(2));  
	  list.addToTheLast(new Node(9)); 
	  
	  list.printList(head);  
	  //Reversing LinkedList  
	  Node reverseHead=reverseLinkedListRecursive(head);  
	  System.out.println("After reversing by using rec");  
	  list.printList(reverseHead);  
	  
	  Node reverseHead1=reverse(head);  
	  System.out.println("After reversing by using reverse with Head of Reverse ::: ");  
	  list.printList(reverseHead1); 
	 }  
	  
	
	public static Node reverse(Node h0) {
	    Node headOfUnReversedLL = h0;
	    Node headOfReversedLL = null;
	    Node nodeToReverse = null;
	    while (headOfUnReversedLL != null) {
	    	//System.out.println(" " + headOfUnReversedLL + "  "+headOfReversedLL+ "   "+nodeToReverse);  
	        headOfReversedLL = nodeToReverse;
	        nodeToReverse = headOfUnReversedLL;
	        headOfUnReversedLL = headOfUnReversedLL.next;
	        nodeToReverse.next = headOfReversedLL;
	    }
	    headOfReversedLL = nodeToReverse;
	    return headOfReversedLL;
	}
	
	} 
