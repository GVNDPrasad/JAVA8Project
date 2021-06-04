package com.java8.fi;

//Lamda-Expression with parameters

class Lamda3Test implements ILamda3{
	
	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}
	
}

public class Lamda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a = 10;
		final int b = 5;
		int c = 0;

        Lamda3Test le3 = new Lamda3Test();
        System.out.println("Java 7 :: leMul()"+le3.mul(a, b));
		
		
		ILamda3 il3 = (int x,int y) -> {
			int z = x * y;
			return z;
		};
		System.out.println("Java 8 :: leMul()"+il3.mul(a, b));
		
		ILamda3 il31= (x,y) -> {
			return x*y;
		};
		System.out.println("Java 8 :: leMul()"+il31.mul(a, b));
		
		
	}

}
