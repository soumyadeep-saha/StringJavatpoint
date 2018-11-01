package com.soumyadeep.string.methods;

public class StringJoin {

	public static void main(String[] args) {

		String s1=String.join("", "1","2","3","4","");
		System.out.println(s1);
		String s2=String.join("billion$", "1","2","3","4");
		System.out.println(s2);
	}
}
