package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
		
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=i; j--) {
					
				}System.out.print("+"+i);
				//  숫자 하나의 +를 없애는 방법을 모르겠어요!
			
			sum = sum+i;
				
			}
		System.out.println("");
		System.out.println("합계 :" + sum);
		sc.close();
	}
}
