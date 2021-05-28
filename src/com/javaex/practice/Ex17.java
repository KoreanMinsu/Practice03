package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력했:");
		int num = sc.nextInt();	
			
		
			for(int x=1; x<=num; x++) {
				
				for(int y=num; x<=y; y--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
			for(int x=2; x<=num; x++) {
				
				for(int y=1; y<=x; y++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		
		sc.close();
	}
}
