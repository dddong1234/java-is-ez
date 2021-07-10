package com.lilspicy.ch04;

public class Exercise4_5 {

	public static void main(String[] args) {
//		for(int i = 0; i<=10; i++) {
//			for(int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();	
//		}
	
		int a = 1;
		int j = 1;
		while(a<=11) {
			while(j<=a) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			a++;
			j=1;
		}

	}

}
