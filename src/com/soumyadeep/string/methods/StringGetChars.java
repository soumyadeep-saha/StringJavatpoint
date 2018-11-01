package com.soumyadeep.string.methods;

public class StringGetChars {

	public static void main(String[] args) {

		String s="soumyadeep soumyadeep1 saha is a bad boy";
		char [] charArr=new char[100];
		s.getChars(11, 23, charArr, 0);
		System.out.println(charArr);
		s.getChars(11, 220, charArr, 0);
		System.out.println(charArr);
	}
}
