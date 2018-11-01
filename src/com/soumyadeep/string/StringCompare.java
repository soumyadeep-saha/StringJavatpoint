package com.soumyadeep.string;

public class StringCompare {

	public static void main(String[] args) {

		//by equals method
		String s1="soumyadeep";
		String s2="soumyadeep";
		String s3="Soumyadeep";
		String s4="saha";
		System.out.println("By equals method");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s1));
		
		//by == operator
		String ss1="soumyadeep";
		String ss2="soumyadeep";
		String ss3="Soumyadeep";
		String ss4=new String("soumyadeep");
		System.out.println("By == operator");
		System.out.println(ss1==ss2);
		System.out.println(ss1==ss3);
		System.out.println(ss1==ss4);
		System.out.println(ss3==ss4);
		
		//by compareTo() method
		String s1s="soumyadeep";
		String s2s="soumyadeep";
		String s3s="Soumyadeep";
		String s4s="saha";
		String s5s="rrrrrrrrrrrrrrr";
		String s6s="soumyadaap";
		System.out.println("By compareTo() method");
		System.out.println(s1s.compareTo(s1s));
		System.out.println(s1s.compareTo(s2s));
		System.out.println(s1s.compareTo(s3s));
		System.out.println(s1s.compareTo(s4s));
		System.out.println(s1s.compareTo(s5s));
		System.out.println(s1s.compareTo(s6s));
		System.out.println(s6s.compareTo(s1s));
	}

}
