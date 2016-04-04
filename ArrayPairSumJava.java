/**
 * 
 */
package com.src.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sreekanth
 *
 */
public class ArrayPairSumJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Valid Test Case Data
		final int[] foundDataArray = {4,8,9,27,15,1};
		final int[] notFoundDataArray = {1,20,15,30,34};
		final int foundMatchSum = 42;
		final int notFoundMatchSum = 36;
		
		// Failed Case Scenario i.e invalid Data
		
		/*final int[] foundDataArray = {21,21,1};
		final int[] notFoundDataArray = {1,20};
		final int foundMatchSum = 0;
		final int notFoundMatchSum = 0;*/
		
		// For Found Case Scenario
		foundPairSumApp(foundDataArray,foundMatchSum);
		
		// For Not Found case Scenario
		foundPairSumApp(notFoundDataArray, notFoundMatchSum);
		
	}
	/**
	 * Method to found the pair sum approach 
	 */
    public static void foundPairSumApp(int[] foundDataArray, int foundMatchSum){
    	if(foundDataArray.length > 2 && foundMatchSum > 0){
			boolean foundMatchBoolean = pairSumApp(foundDataArray,foundMatchSum);
			System.out.println("Sum Matched pair :"+foundMatchBoolean);
		} else {
			System.out.println("Array Lenght should be more than 2 elements / Sum value is not Zero");
		}
    }
    
	public static boolean pairSumApp(int[] input, int k){
		boolean isSumMatched = false;
		    Map<Integer, Integer> pairMapInteger = new HashMap<Integer, Integer>();
		    for(int i=0;i<input.length;i++){
		    	if(!pairMapInteger.containsKey(input[i])) {
		    		 pairMapInteger.put(k-input[i], input[i]);
		    		 // Here it is not found, it will continue for the remaining elements in the Array.
			         isSumMatched = false;
			         continue;
		    	} else {
		    		// Here if matched pair found, then it will break the current execution.
		    		isSumMatched = true;
		            break;
		    	}
		    }
		    return isSumMatched;
		}
	}
