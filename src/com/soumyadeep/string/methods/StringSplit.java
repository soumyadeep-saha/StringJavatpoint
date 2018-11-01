package com.soumyadeep.string.methods;

public class StringSplit {

	public static void main(String[] args) {

		String s1="1 2 3 4 5 6 7 8 9";
		String s2="1-2-3-4-5-6-7-8-9";
		String [] sar1=s1.split("\\s");
		String [] sar2=s1.split("\\s",1);
		String [] sar3=s1.split("\\s",3);
		String [] sar4=s1.split("\\s",20);

		System.out.println(sar1.length);
		System.out.println(sar1);
		for(String s: sar1) {
			System.out.println(s);
		}
		
	}
}
