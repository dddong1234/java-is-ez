package com.lilspicy.ch03;

public class Exercise3_4 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		
		int x = numOfApples;
		int y = sizeOfBucket;
		
		int numOfBucket = (x%y == 0) ? x/y : (x/y)+1;
		System.out.println("필요한 바구니의 수 :"+numOfBucket);

	}

}
