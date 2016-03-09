package com.gym.javap.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Test reverse String."; 
		System.out.println("Before reverse the words are "+str);
		String revStr = reverseTheWords(str);
		System.out.println("Reverse words are "+revStr);
		
		//write a program to count the 2 letter words in a sentence. Eg. "I am in love with New York" should return 2 (am and in).
		   String a="i am in love with new york ab kim jp diej";
		   String b[]=a.split(" ");
		   Map<String, String> map = new HashMap<String, String>();
		   for(int i=0;i<b.length;i++){
			   if(b[i].length()==2){
				   String k=b[i];
				   map.put(k, String.valueOf(k.length()));
				   //System.out.println(k.length());
				   //break;
			   	}
		   }
		   System.out.println("Map Size "+map.size());
		  // Traverse HashMap in 4 wasys:
		   for (String key : map.keySet()) {
			   System.out.println("------------------------------------------------");
			   System.out.println("Iterating or looping map using java5 foreach loop");
			   System.out.println("key: " + key + " length: " + map.get(key));
			}
		   
		   Set<String> keySet = map.keySet();
		   Iterator<String> keySetIterator = keySet.iterator();
		   while (keySetIterator.hasNext()) {
		      System.out.println("------------------------------------------------");
		      System.out.println("Iterating Map in Java using KeySet Iterator");
		      String key = keySetIterator.next();
		      System.out.println("key: " + key + " value: " + map.get(key));
		   }
		   
		   Set<Map.Entry<String, String>> entrySet = map.entrySet();
		   for (Entry entry : entrySet) {
		      System.out.println("------------------------------------------------");
		      System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
		      System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		   }
		   
		   Set<Map.Entry<String, String>> entrySet1 = map.entrySet();
		   Iterator<Entry<String, String>> entrySetIterator = entrySet1.iterator();
		   while (entrySetIterator.hasNext()) {
		      System.out.println("------------------------------------------------");
		      System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
		      Entry entry = entrySetIterator.next();
		      System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		   }

	}
	
	public static String reverseTheWords(String str){
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException("String can't be null or empty");
        boolean hasPeriod = str.endsWith(".");
        if (hasPeriod) str = str.substring(0, str.length()-1);
        
        String[] array = str.split(" ");
        int upperBound = array.length - 1;
        StringBuilder sb = new StringBuilder("");
        for (int i = upperBound; i > 0; i--){
            sb.append(array[i] + " ");
        }
        sb.append(array[0]);
        return (hasPeriod)? sb.append(".").toString() : sb.toString();
    }

   //public static HashMap<String, int>(String str){
	
   //}
}
