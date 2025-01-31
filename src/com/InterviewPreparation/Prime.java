package com.InterviewPreparation;
import java.util.Scanner;

public class Prime {
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Scanner scn = new Scanner(System.in); System.out.println("Enter a number");
	 * int num = scn.nextInt(); if(isPrime(num)) { System.out.println(num +
	 * "Prime"); } else { System.out.println(num + "Not Prime"); }
	 * 
	 * }
	 * 
	 * public static boolean isPrime(int number) { for(int i =2; i<=number/2;i++) {
	 * if(number%i==0) { return false; } } return true; }
	 */
	public static void main(String arg[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter starting number");
		int start = scn.nextInt();
		System.out.println("Enter a End Number");
		int end = scn.nextInt();
		System.out.println("Start number" + start + "End Number" + end);
		
		for(int i =start;i<=end;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isprime(int num) {
		// TODO Auto-generated method stub
		if( num < 2 ) {
			return false;
			
		}
		for(int i=2 ; i<=num/2;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}
}


