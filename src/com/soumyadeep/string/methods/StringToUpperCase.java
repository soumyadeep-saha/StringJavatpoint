package com.soumyadeep.string.methods;

import java.util.Locale;

public class StringToUpperCase {

	public static void main(String[] args) {

		String s1="hello StrinG";  
		String s1Upper=s1.toUpperCase();  
		System.out.println(s1Upper);
        String s = "hello string";    
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
        String english = s.toUpperCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish);
        System.out.println(english);
	}
}
