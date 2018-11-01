package com.soumyadeep.string;

public class WhatIsString {
	
	public static void main(String[] args) {
		
		char [] ch= {'s','o','u','m','y','a','d','e','e','p'};
		String s1=new String(ch);
		System.out.println(s1);
		
		String s2="soumyadeep1";
		String s3="soumyadeep1";
		
		String s4=new String("soumyadeep1");
		String s5=new String("soumyadeep2");
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}
}
