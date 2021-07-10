package com.lilspicy.ch04;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("char형 변수 ch가 영문자일 때 true인 조건식");
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력>");
		ch = scanner.next().charAt(0);
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
		
		System.out.println("int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식");
		int year;
		Scanner scanner_1 = new Scanner(System.in);
		System.out.print("입력");
		year = scanner_1.nextInt();
		
		if ((year%400 == 0)||(year%4==0 && year%100 !=0)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("문자열 참조변수 str이 \"yes\" 일때 true인 조건식");
		Scanner scanner_2 = new Scanner(System.in);
		System.out.print("입력");
		String str = scanner_2.nextLine();
		
		if (str.equals("yes")) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
		
	}

}
