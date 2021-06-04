package com.java8.le.fi.defaultblock;

public class HDFCBank {
	
	public static void main(String[] args) {
		
		RBIBank rbi = () -> {
    		String bank = "HDFC Bank";
    		System.out.println("Bank Name is: "+bank);
    	};
    	rbi.bankName();
    	
    	rbi.rules();
		
	}

}
