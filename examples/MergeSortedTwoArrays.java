package com.gym.javap.examples;

public class MergeSortedTwoArrays {
	  public static void main(String[] args) {
	    int[] firstArray = { 13, 37, 71, 85 };
	    int[] secondArray = { 7, 14, 29, 65, 72, 94 };
	    int[] thirdArray = new int[firstArray.length+secondArray.length];

	    merge(firstArray, firstArray.length, secondArray, secondArray.length, thirdArray);
	    for (int i : thirdArray) {
	      System.out.println(i);
	    }
	  }

	  public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
	    int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;

	    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
	      if (arrayA[arrayAIndex] < arrayB[arrayBIndex])
	        arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
	      else
	        arrayC[arrayCIndex++] = arrayB[arrayBIndex++];

	    while (arrayAIndex < sizeA)
	      arrayC[arrayCIndex++] = arrayA[arrayAIndex++];

	    while (arrayBIndex < sizeB)
	      arrayC[arrayCIndex++] = arrayB[arrayBIndex++];
	  }
	}
