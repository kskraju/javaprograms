package com.gym.javap.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStringFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
		String text = "aa ra ba ka ca da sa fa aa da fa sa sa fa dd sa aa da fa";
		
        List<String> list = Arrays.asList(text.split(" "));
 
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }

	}

}
