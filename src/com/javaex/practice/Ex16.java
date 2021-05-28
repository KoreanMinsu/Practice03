package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력하슈");
		int num = sc.nextInt();
		int q = num/5;
		int sum = 0;
		System.out.println("5의 배수의 개수: " + q );
		
		for(int i = 1; i<=q; i++) {
			sum = sum+i;
			
		} System.out.println("5의 배수의 합 :" + 5*sum );
		
		sc.close();
	}	
	
}

