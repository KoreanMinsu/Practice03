package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		int cNum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하슈");
		
			for(int i=0; i<5; i++) {
				System.out.print("숫자: ");
				int num = sc.nextInt();
				
				if(num>cNum) {
					cNum=num;
				}
			} 
			
		System.out.println("최대값은 " +cNum+ " 입니다.");
			
		
		
		sc.close();
	}
}
