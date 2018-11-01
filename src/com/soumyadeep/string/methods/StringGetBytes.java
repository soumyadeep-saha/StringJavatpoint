package com.soumyadeep.string.methods;

public class StringGetBytes {

	public static void main(String[] args) {

		String s1="abcdefgh";
		String s2="ABCDEFGH";
		byte [] baar1=s1.getBytes();
		byte [] baar2=s2.getBytes();
		System.out.println("abcdefgh in bytes");
		for (int i = 0; i < baar1.length; i++) {
			System.out.println(baar1[i]);
		}
		System.out.println("ABCDEFGH in bytes");
		for (int i = 0; i < baar1.length; i++) {
			System.out.println(baar2[i]);
		}
		//bytes in string
		String s3=new String(baar1);
		System.out.println(s3);
		String s4=new String(baar2);
		System.out.println(s4);
		
	}
}
