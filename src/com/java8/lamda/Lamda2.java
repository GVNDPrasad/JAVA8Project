package com.java8.lamda;

//Lamda-Expression with parameters

class Lamda2Test implements ILamda2{
	
	public void add(int a, int b) {
		int d = a + b;
		System.out.println("Java 7 :: add() = "+d);
	}
	
}

public class Lamda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a = 10;
		final int b = 5;
		int c = 0;

        Lamda2Test le2 = new Lamda2Test();
		le2.add(a,b);
		
		ILamda2 il2 = (int x,int y) -> {
			int z = x + y;
			System.out.println("Java 8 :: leShow()"+z);
		};
		il2.add(a, b);
		
		ILamda2 il3 = (x,y) ->  System.out.println("Java 8 :: leShow()"+(x+y));
		il3.add(a, b);
		
	}

}
