package com.src.java;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strin = "abcbda";
		if(isPal(strin))
            System.out.println(strin + " is a palindrome");
        else
            System.out.println(strin + " is not a palindrome");
		
		System.out.println("Is Anagram "+iAnagram("word","wrdo"));
		System.out.println("Is AnagramMethod :::  "+isAnagramMethod("pure","in"));

	}
	
	public static boolean isPal(String str){
		if(str.length() == 0 || str.length() ==1)
			return true;
		
		if(str.charAt(0) == str.charAt(str.length()-1))
		 return isPal(str.substring(1, str.length()-1));
		
		return false;
	}
	
	public static boolean isAnagramMethod(String original, String anagr){
		char[] charOrig = original.toCharArray();
		char[] charAnag = anagr.toCharArray();
		Arrays.sort(charOrig);
		Arrays.sort(charAnag);
		return Arrays.equals(charOrig, charAnag);
	}
    public static boolean iAnagram(String word, String anagram){
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();       
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }

  



}
