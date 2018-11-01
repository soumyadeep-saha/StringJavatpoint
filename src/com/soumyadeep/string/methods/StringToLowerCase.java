package com.soumyadeep.string.methods;

import java.util.Locale;

public class StringToLowerCase {

	public static void main(String[] args) {

		String s1="HELLO StrinG";  
		String s1Lower=s1.toLowerCase();  
		System.out.println(s1Lower);
        String s = "hello string";    
        String turkish = s.toLowerCase(Locale.forLanguageTag("tr"));  
        String english = s.toLowerCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish);
        System.out.println(english);
	}
}
