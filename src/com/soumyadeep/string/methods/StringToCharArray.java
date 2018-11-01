package com.soumyadeep.string.methods;

public class StringToCharArray {

	public static void main(String[] args) {

		String s="abcdefghijklmnopqrstuvwxyz";
		char [] ch=s.toCharArray();
		System.out.println(ch);
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		for(char c: ch) {
			System.out.println(c);
		}
	}
}
