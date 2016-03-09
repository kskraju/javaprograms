package com.gym.javap.examples;

public class BinarySearch {  
	  
	 
	public static int binaySearchValue(int[] sortedArray, int searchElement){
		int start = 0;
		int end = sortedArray.length -1;
		System.out.println("Start  "+start +"  End   : "+end);
		while (start < end) {
			int mid = start + end / 2;
			if(searchElement < sortedArray[mid]){
				System.out.println("In 1st If  End   : "+end);
				end = mid;
			} else if(searchElement > sortedArray[mid]){
				System.out.println("In 2nd If  "+start );
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	 public  static int binarySearch(int[] sortedArray, int elementToBeSearched) {  
	  int first = 0;  
	        int last = sortedArray.length - 1;  
	        System.out.println("first  "+first +"  last   : "+last);
	      while (first < last) {  
	         
	          int mid = (first + last) / 2;  // Compute mid point.  
	          System.out.println(" mid :::::::  : "+mid);
	          if (elementToBeSearched < sortedArray[mid]) {  
	        	  System.out.println(" Last   : "+last);
	           last = mid;     // repeat search in first half.  
	          } else if (elementToBeSearched > sortedArray[mid]) {  
	              first = mid + 1;  // Repeat sortedArray in last half.  
	          } else {  
	              return mid;     // Found it. return position  
	          }  
	      }  
	       
	      return -1;    // Failed to find element  
	  }  
	   
	 public static void main(String[] args)  
	 {  
	  System.out.println("Test :::::");
	  int[] sortedArray={12,56,74,96,112,114,123,567};  
	  int indexOfElementToBeSearched=binarySearch(sortedArray,74);  
	  System.out.println("Index of 74 in array is: " +indexOfElementToBeSearched);  
	    
	  int indexOfElementToBeSearchedNotFound=binarySearch(sortedArray,7);  
	  System.out.println("Index of 7 in array is: " +indexOfElementToBeSearchedNotFound);  
	 }  
	   
	}  

