package com.src.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class AnagramSolution {
   /*
     
     @input Set of words to find anagrams, e.g. “from”,”on”,”give”,”pool”,”loop”,”polo”,”form”,”no”,”let”
     @return Set of anagram groups discovered, e.g. [“form”,”from”],[“no”,”on”],[“loop”,”polo”,”pool”]
   */
   static Set<Set<String>> solve(Set<String> input) {
        // Write your code here
     
     // Read the entire set, iterate the each word from the set.
     // take the first element, then compare the remaining words.
     // if first element is matched with the any word of anagram, then need to create one set and
     // add the element.
     // if second element is matched, then need to find the anagram word and then add to set
     
     List<String> alist = new ArrayList<String>();
     
     Iterator<String> iter = input.iterator();
     String originalWord;
     //iterate the entire set<String> input 
     while(iter.hasNext()){
         originalWord = iter.next();
         alist.add(originalWord);
       // adding all the words into the list
     }
     Set<Set<String>> setString = new HashSet<Set<String>>();
     Set<String> setWords = null ;
     
        
     //after this loop, list is having all the elements.
     // need to loop through the each element from the list of size
     // take first/index=0 element,
     String originalListWord = null;
     String secondListWord = null;
     
     for (int i =0;i < alist.size();i++){
          originalListWord = alist.get(i); // "from"
          setWords = new HashSet<String>();
          for(int j = 1; j <alist.size()-1;j++) {
              secondListWord = alist.get(j);  // remaining all the element "on","no","
              char[] originalListChar = originalListWord.toCharArray();
              char[] secondListChar = secondListWord.toCharArray();
              Arrays.sort(originalListChar);
              Arrays.sort(secondListChar);
              if(Arrays.equals(originalListChar,secondListChar)){
                setWords.add(originalListWord);
                setWords.add(secondListWord);
              }
      
          }
       if(setWords != null && !setWords.isEmpty() && setWords.size()>= 2){
         setString.add(setWords);
       } 
     
     }
     
     
     
     //
     
       return setString;
   }

 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   // DO NOT MODIFY BELOW THIS LINE

   public static void main(String[] args) {
       List<TestCase> cases = getTestCases();
       for (TestCase c : cases) {
           if (c == null) {
               continue;
           }
           String prefix = String.format("%-25s| ", "'" + c.name + "'");
           try {
               runCase(c);
               System.out.println(prefix + "Success");
           } catch (AssertionError e) {
               System.out.println(prefix + "Failed: " + e.getMessage());
               System.out.println("Input: "  + c.input);
               System.out.print("Stacktrace: ");
               e.printStackTrace(System.out);
               return;
           }
       }
   }

   static void runCase(TestCase c) throws AssertionError {
       try {
           Set<Set<String>> output = solve(c.input);
           if (c.exceptionClass != null) {
               throw new AssertionError(String.format("Expected exception '%s' but not thrown, '%s' was returned instead", c.exceptionClass, output));
           }
           if (!compareAnswer(c.output, output)) {
               throw new AssertionError(String.format("Wrong answer: expected '%s', actual '%s'", c.output, output));
           }
       } catch (Exception e) {
           if (c.exceptionClass == null || !c.exceptionClass.equals(e.getClass())) {
               throw new AssertionError(String.format("Unexpected exception: %s", e), e);
           }
       }
   }

   static boolean compareAnswer(Set<Set<String>> expected, Set<Set<String>> actual) {
       return Objects.equals(expected, actual);
   }

   @SuppressWarnings("unchecked")
   static List<TestCase> getTestCases() {
       return list(
               new TestCase() {{ name = "Happy path"; input = set("ab", "ac", "ba", "ca", "cd"); output = set(set("ab", "ba"), set("ac", "ca")); }},

               // More cases
               new TestCase() {{ name = "Many anagrams"; input = set("abc", "acb", "bac", "bca", "cab", "cba", "q"); output = set(set("abc", "acb", "bac", "bca", "cab", "cba")); }},
               new TestCase() {{ name = "No anagrams"; input = set("ab", "ac", "bc"); output = set(); }},
               new TestCase() {{ name = "Long string"; input = set("abcdefghijklmnopqrstuvwxyz", "bacdefghijklmnopqrstuvwxyz"); output = set(set("abcdefghijklmnopqrstuvwxyz", "bacdefghijklmnopqrstuvwxyz")); }},

               // Edge cases
               new TestCase() {{ name = "No items"; input = set(); output = set(); }},
               new TestCase() {{ name = "Empty string"; input = set("ab", "ba", ""); output = set(set("ab", "ba")); }},
               new TestCase() {{ name = "Not a letter"; input = set("1#@", "@1#", "!&", "&!", "^%#"); output = set(set("1#@", "@1#"), set("!&", "&!")); }},
               new TestCase() {{ name = "Not a character"; input = set("\t\n\r\u1003", "\r\n\t\u1003", "\r\n"); output = set(set("\t\n\r\u1003", "\r\n\t\u1003")); }},

               // Bad input
               new TestCase() {{ name = "Null input"; input = null; exceptionClass = IllegalArgumentException.class; }},
               new TestCase() {{ name = "Null element"; input = set("ab", "ba", null); exceptionClass = IllegalArgumentException.class; }},

               null // So we can always use commas after test case definition
       );
   }

   @SafeVarargs
   @SuppressWarnings("varargs")
   static <T> List<T> list(T ...items) {
       return Arrays.asList(items);
   }

   @SafeVarargs
   @SuppressWarnings("varargs")
   static <T> Set<T> set(T ...items) {
       return new LinkedHashSet<>(list(items));
   }

   static class TestCase {
       String name;
       Set<String> input;
       Set<Set<String>> output;
       Class<?> exceptionClass;
   }
}