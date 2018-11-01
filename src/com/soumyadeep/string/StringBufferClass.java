package com.soumyadeep.string;

public class StringBufferClass {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("soumyadeep");
		sb.append(" saha");
		System.out.println(sb);
		
		sb.insert(1, "ss");
		System.out.println(sb);
		
		sb.replace(0, 3, "Ss");
		System.out.println(sb);
		
		sb.delete(1, 2);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("soumyadeep");
		System.out.println(sb1.capacity());
		sb.append("1111111111111");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(56);
		System.out.println(sb1.capacity());
		
		
	}
}
