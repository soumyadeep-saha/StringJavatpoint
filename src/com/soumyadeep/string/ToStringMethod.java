package com.soumyadeep.string;

public class ToStringMethod {

	private String name;
	private int age;
	private String country;
	private String name1;
	private int age1;
	private String country1;
	
	public ToStringMethod(String name,int age,String country,String name1,int age1,String country1) {
		this.name=name;
		this.age=age;
		this.country=country;
		this.name1=name1;
		this.age1=age1;
		this.country1=country1;
	}
	
	@Override
	public String toString() {
		return name+" "+age+ " "+country;
	}
	public static void main(String[] args) {
		
		ToStringMethod toStringMethod=new ToStringMethod("soumyadeep",28,"india",null, 0, null);
		System.out.println(toStringMethod);
	}
}

