package com.java8.le.fi.constructorref;

public class ConstructerRef1 {
	
	ConstructerRef1(){
		System.out.println("Constructor Refrence");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Inter i = ConstructerRef1 :: new; //Syntax: ClassName :: new keyword;
	   i.m1();

	}

}
