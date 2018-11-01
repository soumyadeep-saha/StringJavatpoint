package com.soumyadeep.string.methods;

public class StringConcatMethod {

	public static void main(String[] args) {

		String s1="hi";
		String s2="soumyadeep";
		String s3="saha";
		s1.concat("hi");
		System.out.println(s1);
		String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
		System.out.println(s4);
		s1=s1.concat("hi");
		System.out.println(s1);		
	}
}
