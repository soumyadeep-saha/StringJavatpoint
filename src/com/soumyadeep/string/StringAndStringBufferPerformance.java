package com.soumyadeep.string;

public class StringAndStringBufferPerformance {
	
	public static void concatWithString() {
		String s1="soumyadeep";
		for(int i=0; i<10000; i++) {
			s1=s1+"soumyadeep";
		}
	}
	
	public static void concatWithStringBuilder() {
		StringBuffer sb= new StringBuffer();
		sb.append("soumyadeep");
		for(int i=0; i<10000; i++) {
			sb.append("soumyadeep");
		}
	}

	public static void main(String[] args) {
		
		long start=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken with string: "+(System.currentTimeMillis()-start)+"ms");
		start=System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time taken with string buffer: "+(System.currentTimeMillis()-start)+"ms");
	}
}
