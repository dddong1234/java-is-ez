package com.lilspicy.ch04;

public class Exercise4_3 {

	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=i; j++) {
//				sum += j;
//			}
//		}System.out.println(sum);
		   int result = 0;
		   int cal = 0;
	        for (int i = 1; i <= 10; i++) {
	            cal += i;
	            result += cal;
	        }
	        System.out.println("result = " + result);

	}

}
