package com.lilspicy.ch04;

public class Exercise4_7 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i)-48;
//			int tmp = num%10;
//			num /= 10;
//			sum += tmp;
		}
		System.out.println("sum = "+sum);
	}
}
