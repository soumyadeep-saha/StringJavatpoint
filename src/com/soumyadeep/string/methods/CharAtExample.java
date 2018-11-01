package com.soumyadeep.string.methods;

public class CharAtExample {
	
	public static String s="soumyadeep saha";

	public static void main(String[] args) {

		//normal charAt
		System.out.println(s.charAt(8));
		//finding length
		int length=s.length();
		System.out.println(length);
		//first and last character
		System.out.println(s.charAt(0) + " " + s.charAt(length-1));
		//StringIndexOutOfBoundException
		System.out.println(s.charAt(11));
		//find all character at odd places
		for(int i=0; i<length; i++) {
			while(i%2!=0) {
				System.out.println("Letters at odd places: "+s.charAt(i));
				i++;
			}
		}
		//find a particular character
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
