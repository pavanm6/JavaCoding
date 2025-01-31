package com.InterviewPreparation;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scn = new Scanner(System.in); System.out.println("Enter a number :");
		 * int num = scn.nextInt(); if(num %2 ==0) { System.out.println("Even Number");
		 * }else { System.out.println("Odd Number"); }
		 */

		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Starting number :");
		int start = scn.nextInt();
		System.out.println("Enter a Ending number :");
		int end = scn.nextInt();
		for(int i =start;i<=end;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}

}
