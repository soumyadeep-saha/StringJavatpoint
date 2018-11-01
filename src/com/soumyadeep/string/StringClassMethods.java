package com.soumyadeep.string;

public class StringClassMethods {

	public static void main(String[] args) {

		 String s1="Soumyadeep Saha";
		 String s2="  Soumyadeep Saha  ";
		 System.out.println(s1.toLowerCase());
		 System.out.println(s1.toUpperCase());
		 System.out.println(s2.trim());
		 System.out.println(s1.startsWith("So"));
		 System.out.println(s1.startsWith("so"));
		 System.out.println(s1.endsWith("ha"));
		 System.out.println(s1.charAt(11));
		 System.out.println(s1.length());
		 
		 String s3="soumyadeep";
		 String s4=s3.intern();
		 System.out.println(s4);
		 
		 int x=18;
		 System.out.println(x+18);
		 String s5=String.valueOf(x);
		 System.out.println(s5+18);
		 
		 String s6="microservices";
		 String s= s6.replace("micro","nano");
		 System.out.println(s);
	}
}
