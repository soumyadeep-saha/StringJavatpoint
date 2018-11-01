package com.soumyadeep.string.methods;

public class StringLastIndexOf {

	public static void main(String[] args) {

		String s="krishna is god krishna is god krishna is god krishna is god";
		int x1=s.lastIndexOf('r');
		System.out.println(x1);
		int x2=s.lastIndexOf('r',45);
		System.out.println(x2);
		int x3=s.lastIndexOf("krishna");
		System.out.println(x3);
		int x4=s.lastIndexOf("krishna",42);
		System.out.println(x4);
				
	}
}
