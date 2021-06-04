package com.java8.le.fi.defaultblock.staticblock;

public class SBIBank {
	
    public static void main(String[] args) {
		
    	RBIBank rbi = () -> {
    		String bank = "SBI Bank";
    		System.out.println("Bank Name is: "+bank);
    	};
    	rbi.bankName();
    	
    	System.out.println(rbi.control());
	}

}
