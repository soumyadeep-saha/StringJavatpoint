package com.soumyadeep.string.methods;

public class StringIntern {

	public static void main(String[] args) {

		String s1="soumyadeep1";
		String s2=s1.intern();
		String s3="soumyadeep1";
		String s4=s3.intern();
		String s5=new String("soumyadeep1");
		String s6=new String("soumyadeep1");
		String s7=s5.intern();
		String s8=s6.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s1==s7);
		System.out.println(s1==s8);
		System.out.println(s1==s1);
	}
}
