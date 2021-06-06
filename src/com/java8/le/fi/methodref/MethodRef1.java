package com.java8.le.fi.methodref;

public class MethodRef1 {
	
	public static void m2() {
		System.out.println("Method Reference with static method");
	}
	
	public static void main(String[] args) {
		
		Inter i = MethodRef1 :: m2; //Syntax: ClassName :: Method Name
		i.m1();

	}

}
