package com.soumyadeep.string;

public class ImmutableString {
	
	public static void main(String[] args) {

		String s="soumyadeep";
		s.concat("saha");
		System.out.println(s);
		
		String s1="soumyadeep";
		s1=s1.concat("saha");
		System.out.println(s1);
	}
}
