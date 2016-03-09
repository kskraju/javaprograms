package com.gym.javap.examples;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample
{
    public static void main(String[] args)
    {
    	/**
    	Recap : Difference between Fail Fast Iterator and Fail Safe Iterator

												Fail Fast Iterator			Fail Safe Iterator
		Throw ConcurrentModification Exception		Yes							No
		Clone object 								No							Yes
		Memory Overhead								No							Yes
		Examples							  HashMap,Vector,ArrayList,    	CopyOnWriteArrayList,ConcurrentHashMap
												 HashSet	

		**/
  
        ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple1", "iPhone");
        premiumPhone.put("HTC1", "HTC one");
        premiumPhone.put("Samsung1","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        
    }
    
}