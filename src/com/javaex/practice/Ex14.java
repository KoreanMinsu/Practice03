package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
		
			for(int i=1; i<=num; i++) {
			System.out.print(i+"+");
			
			sum = sum+i;
			
			}
		System.out.println("");
		System.out.println("합계 :" + sum);
		sc.close();
	}
}
