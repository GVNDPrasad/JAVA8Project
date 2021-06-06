package com.java8.le.fi.methodref;

public class MethodRef2 {
	
	public void m2() {
		System.out.println("Method Reference with-out static/Instance method");
	}
	
	public static void main(String[] args) {
		MethodRef2 mr2 = new MethodRef2();
		Inter i = mr2 :: m2; //Syntax: ClassName :: Method Name
		i.m1();

	}

}
