package com.soumyadeep.string;

public final class CreateImmutableClass {

	public final String name;
	
	public CreateImmutableClass(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		CreateImmutableClass createImmutableClass=new CreateImmutableClass("soumyadeep");
		createImmutableClass.display();
	}
}
