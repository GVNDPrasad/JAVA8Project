package com.java8.le.fi.defaultblock.staticblock;

@FunctionalInterface
public interface InterStat {

	//In FI we will create only one abstract method
	public void m1();
	
	//Static method in FI able to access with implementing class and without implementing class
	public static void m2() {
		System.out.println("Static method in FI");
	}
	
	//Default methods will call required classes
	default void m3() {
		System.out.println("Default method in FI");
	}
	
}
