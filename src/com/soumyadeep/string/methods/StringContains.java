package com.soumyadeep.string.methods;

public class StringContains {

	public static void main(String[] args) {

		String s="soumyadeep saha is a good boy";
		boolean b1=s.contains(s);
		boolean b2=s.contains("good");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s.contains("good"));
		
		if(s.contains("is a good")) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
	}
}
