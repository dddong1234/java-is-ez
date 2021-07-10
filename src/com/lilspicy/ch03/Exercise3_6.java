package com.lilspicy.ch03;

public class Exercise3_6 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius_1 = ((float)fahrenheit - 32)*5/9;
		double celcius = (celcius_1*100 -(int)(celcius_1*100)) >= 0.5 ? ((int)(celcius_1*100+1))/100.0 : ((int)(celcius_1*100))/100.0; 
		// float a = (int)((float) ((fahrenheit - 32)*5/9f + 0.005)*100)/100f;
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);

	}

}
