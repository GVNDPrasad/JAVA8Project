package com.java8.le.fi.defaultblock.staticblock;

public class IciciBank {
	
    public static void main(String[] args) {
    	
    	RBIBank rbi = () -> {
    		String bank = "ICICI Bank";
    		System.out.println("Bank Name is: "+bank);
    	};
    	rbi.bankName();
    	
    	rbi.rules();
		
	}

}
