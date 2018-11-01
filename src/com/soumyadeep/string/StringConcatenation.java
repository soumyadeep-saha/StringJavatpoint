package com.soumyadeep.string;

public class StringConcatenation {

	public static void main(String[] args) {

		//by + operator
		String s1="soumyadeep";
		String s2="saha";
		String s3=s1+s2;
		String s4=s1+"soumyadeep";
		System.out.println("By + operator");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(90+90+s1+90+90);

		//by concat() method
		String s5="soumyadeep";
		String s6="saha";
		String s7=s1.concat(s2);
		String s8=s1.concat("soumyadeep");
		System.out.println("By + operator");
		System.out.println(s7);
		System.out.println(s8);
	}
}
