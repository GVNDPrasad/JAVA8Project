package com.java8.fi;

//Lamda-Expression with-out parameters

class Lamda1Test implements ILamda1{
	
	public void show() {
		System.out.println("Java 7 :: Show()");
	}
	
}

public class Lamda1 {

	public static void main(String[] args) {

		Lamda1Test le1 = new Lamda1Test();
		le1.show();
		
		ILamda1 il1 = () -> {
			System.out.println("Java 8 :: leShow()");
		};
		
		il1.show();
		
		
	}

}
