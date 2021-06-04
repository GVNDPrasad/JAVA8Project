package com.java8.le.fi.defaultblock.staticblock;

//Without implements Interface able to access FI static block
public class InterStatImpl implements InterStat{
	
	public void m1() {
		System.out.println("Abstarct Method in FI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterStatImpl c = new InterStatImpl();
		c.m1();
	
		InterStat.m2();
		
		InterStat i = () -> {
			System.out.println("Abstarct Method");
		};
		i.m3();

	}

	

}
