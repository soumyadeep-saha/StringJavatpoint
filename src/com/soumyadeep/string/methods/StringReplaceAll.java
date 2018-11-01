package com.soumyadeep.string.methods;

public class StringReplaceAll {

	public static void main(String[] args) {

		String s1="123456789123456789123456789123456789";
		String s2=s1.replace("345","111");
		System.out.println(s2);		
		String s3=s1.replaceAll("345","aaaa");
		System.out.println(s3);
		String s4="ss ss ss ss ss ss ss ss ss ss";
		String s5=s4.replaceAll("\\s", "");
		System.out.println(s5);
	}
}
