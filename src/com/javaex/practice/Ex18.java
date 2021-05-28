package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number:");
		int num = sc.nextInt();
		
		for(int x=1; x<=num; x++) {
			
			for(int y=num; x<=y; y--) {
				System.out.print("*");
			}
			
			System.out.println("");
		} 
		
		
		
		sc.close();
	}
}
