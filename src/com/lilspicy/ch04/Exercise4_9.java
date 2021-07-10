package com.lilspicy.ch04;

public class Exercise4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (true) {
			sum += num%10;
			if (num ==0) 
				break;
			num /= 10;
		}
		System.out.println("sum="+sum);

	}

}
