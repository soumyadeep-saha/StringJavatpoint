package com.soumyadeep.string.methods;

public class StringEndsWith {

	public static void main(String[] args) {

		String s="soumyadeep saha is a good boy";
		boolean b1=s.endsWith("boy");
		boolean b2=s.endsWith("-boy");
		boolean b3=s.endsWith(" boy");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}
}
