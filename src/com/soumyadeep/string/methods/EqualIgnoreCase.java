package com.soumyadeep.string.methods;

import java.util.ArrayList;
import java.util.List;

public class EqualIgnoreCase {

	public static void main(String[] args) {

		String s1="soumyadeep";
		String s2="SOUMYADEEP";
		String s3="soumyadeep";
		String s4="saha";
		String s5="soumyadeep";
		//normal equals
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		//equals with list
		List<String> list=new ArrayList<>();
		list .add("soumyadeep1");
		list .add("soumyadeep2");
		list .add("soumyadeep3");
		list .add("soumyadeep4");
		for(String str:list) {
			if(str.equalsIgnoreCase(s5)) {
				System.out.println("present");
			}else {
				System.out.println("not present");
			}
		}
	}
}
