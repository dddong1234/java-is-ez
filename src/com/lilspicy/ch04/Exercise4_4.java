package com.lilspicy.ch04;

public class Exercise4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int plus = 1;
		int minus = 0;
		int num;
		while (true) {
			sum += plus+minus;
			if (sum>=100) {
				System.out.printf("%d째의 합 %d", plus, sum);
				break;
			}
			plus += 2;
			minus -= 2;
		}

	}

}
