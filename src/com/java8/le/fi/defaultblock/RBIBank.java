package com.java8.le.fi.defaultblock;

@FunctionalInterface
public interface RBIBank {
	
	//Implemented in all classes
	public void bankName();//Abstract Method
	
	//Implemented in required classes
	//Default Method
	default String control() {
		String b = "RBI bank";
		return b;
	}
	
	//Default Method
	 default void rules() {
		System.out.println("Foriegn rules applied");
	 }

}
