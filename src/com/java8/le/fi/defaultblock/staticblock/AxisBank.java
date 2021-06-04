package com.java8.le.fi.defaultblock.staticblock;

public class AxisBank {
	
    public static void main(String[] args) {
    	
    	RBIBank rbi = () -> {
    		String bank = "Axis Bank";
    		System.out.println("Bank Name is: "+bank);
    	};
    	rbi.bankName();//Abstract Method
    	
    	System.out.println(rbi.control());//Default Method
    	
    	rbi.rules();
		
	}

}
