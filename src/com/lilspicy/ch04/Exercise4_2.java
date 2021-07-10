package com.lilspicy.ch04;

public class Exercise4_2 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		for(int i = 1; i<=20; i++) {
			if (!(num%2==0 || num%3==0)) {
				sum += num;
				System.out.printf("num = %d, sum = %d%n",num, sum);
			}
			num++;
		}System.out.println(sum);

	}

}
