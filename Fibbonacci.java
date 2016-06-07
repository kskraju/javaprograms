package com.src.java;

import java.util.Scanner;
import java.util.Stack;


public class Fibbonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		fibonnaci(0,1);
		String reverse = reverseString("The quick    brown fox");
		System.out.println("Reverse "+reverse);
		
		String palindrome = "MALAYALAM" ; // from elsewhere
		boolean isPalindrome = palindrome.equals(new StringBuilder(palindrome).reverse().toString());
		System.out.println(" >>>> "+isPalindrome);
		
		int n = 100;
	    System.out.println(ehFibonacci(n));
	    
	    isFibonacciNumberOrNot(100);
	    isFibonacciNumberOrNot(377);
	    
	    //Find a given number is fibonacci or not
	    System.out.println(">>>>>>"+fibonnaci(0,1, 21));
	    
	    // Reverser words in the phrase
	    StringBuilder sb = new StringBuilder();
	    Scanner sc = new Scanner("Pies are great!");
	    while (sc.hasNext()) {
	        Stack<Character> st = new Stack<Character>();
	        for (char c : sc.next().toCharArray()) {
	            st.push(c);
	        }
	        while (!st.isEmpty()) {
	            sb.append(st.pop());
	        }
	        sb.append(' ');
	    }
	    System.out.print(sb);

	    
	    StringBuilder sbr = new StringBuilder();
	    Scanner sca = new Scanner("Test Reverse String");
	    while (sca.hasNext()){
	    	Stack<Character> stc = new Stack<Character>();
	    	for(char c:sca.next().toCharArray()){
	    		stc.push(c);
	    	}
	    	while(!stc.isEmpty()){
	    		sbr.append(stc.pop());
	    	}
	    	sbr.append(" ");
	    }
	    System.out.println("AAAAAAAAAAAAAAAA"+sbr);
	    
	}
	
	public static void fibonnaci(int i, int j){
		int ii = i;
		int jj = j;
		int kk = ii + jj;
		System.out.println(i+" >>>>>>>>>>>>> ");
		ii = jj;
		jj = kk;
		if(ii < 1000){
			fibonnaci(ii, jj);
		}
	}

	public static boolean fibonnaci(int i, int j, int n){
		int ii = 0;
		int jj = 1;
		System.out.println("jjjj  "+ii);
		do {
			int kk = ii;
			ii = jj;
			jj = kk + jj;
			System.out.println("jjjj  "+jj);
		} while( jj < n);
		
		if(jj == n)
			return true;
		else
			return false;

	}
	
	public static String reverseString(String str){
		if(str.length() == 0){
			return "";
		}
		return str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
	}
	
	public static boolean ehFibonacci(int n) {
	    int fib1 = 0;
	    int fib2 = 1;
	    do {
	    	System.out.println("*********** fib1 "+fib1);
	        int saveFib1 = fib1;
	        fib1 = fib2;
	        fib2 = saveFib1 + fib2;
	        System.out.println("*********** fib2 "+fib2);
	        }
	    while (fib2 <= n);

	    if (fib2 == n)
	        return true;
	    else
	        return false;
	}

	public static void isFibonacciNumberOrNot(int number){
		 
	     if(number<0)
	        System.out.println("Kindly enter a positive number.");
	     else
	     {
	         int a=0, b=1 ,c=0; 
	         /* 'a' is the 1st term, 'b' is the 2nd term and 'c' is the 3rd term
	          * 'c' stores the last generated term of the Fibonacci series */
	      
	          while(c<number) // Loop goes on till the 3rd term is less than the given number
	          {
	        	 
	              c = a + b; // Generating the terms of Fibonacci Series
	              System.out.println(" C  ::: "+c+"    A :::   "+a+"   B  :: "+b);
	              a = b;
	              b = c;
	          }
	      
	          /* When the control comes out of the while loop, either the 
	           * 3rd term is equal to the number or greater than it */
	         
	           if(c==number) // If the last term = number, then it belongs to Fibonacci Series
	              System.out.println("Output : The number belongs to Fibonacci Series.");
	           else
	              System.out.println("Output : The number does not belong to Fibonacci Series.");
	     }
	}
    }
