package com.soumyadeep.string.methods;

public class StringLength {

	public static void main(String[] args) {

		String s1="soumyadeep";
		String s2="";
		System.out.println(s1.length());
		System.out.println(s2.length());
		if(s1.length()==0)
		{
			System.out.println("s1 empty");
		}
		if(s1.length()>0) {
			System.out.println("s1 not empty");
		}
		if(s2.length()==0)
		{
			System.out.println("s2 empty");
		}
		if(s2.length()>0) {
			System.out.println("s2 not empty");
		}
	}
}
