package com.soumyadeep.string.methods;

public class StringIndexOf {

	public static void main(String[] args) {

		String s="soumyadeep saha is a good boy";
		//char with characters
		int x1=s.indexOf('s');
		int x2=s.indexOf('a');
		System.out.println(x1);
		System.out.println(x2);
		//char with from position
		int x3=s.indexOf('s',2);
		int x4=s.indexOf('a',6);
		System.out.println(x3);
		System.out.println(x4);
		String ss="soumyadeep1 saha1 soumyadeep2 saha3 soumyadeep3 saha3 soumyadeep4 saha4";
		//substring
		int x5=ss.indexOf("soumyadeep");
		int x6=ss.indexOf("saha");
		System.out.println(x5);
		System.out.println(x6);
		//substring with position
		int x7=ss.indexOf("soumyadeep",54);
		int x8=ss.indexOf("saha",56);
		System.out.println(x7);
		System.out.println(x8);
		//substring exceeding position
		int x9=ss.indexOf("saha",100);
		System.out.println(x9);
	}
}
