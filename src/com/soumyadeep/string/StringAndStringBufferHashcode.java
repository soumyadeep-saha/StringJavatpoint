package com.soumyadeep.string;

public class StringAndStringBufferHashcode {
	
	public static void main(String[] args) {
		
		String s1="soumyadeep";
		System.out.println(s1.hashCode());
		s1=s1+"saha";
		System.out.println(s1.hashCode());
		
		StringBuffer sb=new StringBuffer("soumyadeep");
		System.out.println(sb.hashCode());
		sb.append("saha");
		System.out.println(sb.hashCode());
	}
}
