package com.java8.le.fi.staticblock;

//Without implements Interface able to access FI static block
public class InterStatImpl2{
	
	public void m1() {
		System.out.println("Abstarct Method in FI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterStatImpl2 c = new InterStatImpl2();
		c.m1();
	
		InterStat.m2();
		
		InterStat i = () -> {
			System.out.println("Abstarct Method");
		};
		i.m3();
		

	}

	

}
