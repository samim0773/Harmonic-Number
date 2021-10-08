package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Any Number :");
		int givenNumber = scanner.nextInt();
		double sum = 0.0;
		if( givenNumber == 0) {
			System.out.println("Enter Number Greater than Zero...");
		}
		for (int i = 1; i <= givenNumber; i++) {
			sum = sum + (double)1/i;
			System.out.println("sum = " + sum);
		}
		System.out.println("Nth Harmonic value is : "+sum);
		
	}

}
