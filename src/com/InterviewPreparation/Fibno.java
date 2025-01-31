package com.InterviewPreparation;

import java.util.Scanner;

public class Fibno {
	public static void main(String [] args) {
		/*
		 * int n = 10, first =0,second=1; System.out.print("Fibnonic series :" + first +
		 * " " + second);
		 * 
		 * for(int i =2;i<n;i++) { int next = first + second; System.out.print(" " +
		 * next); first= second; second = next;
		 * 
		 * }
		 */
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter start number");
		int start = scn.nextInt();
		System.out.println("Enter end number");
		int end = scn.nextInt();		
		int first =0,second = 1;
		System.out.println("Fib between" + start +" and" + end + ":");
		
		while(first<=end) {
			if(first>= start) {
				System.out.print(first + " ");
			}
			int next = first + second;
			first = second;
			second =next;
		}
		scn.close();	}

}
