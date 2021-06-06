package com.java8.le.fi.constructorref;

public class Lamda1 {

	public static void main(String[] args) {
		
		Inter i = () -> {
			System.out.println("Lamda Expression");
		};
		
		i.m1();

	}

}
